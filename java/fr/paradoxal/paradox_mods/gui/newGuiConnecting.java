package fr.paradoxal.paradox_mods.gui;

import fr.paradoxal.paradox_mods.Main;
import fr.paradoxal.paradox_mods.util.Reference;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;

public class newGuiConnecting extends GuiScreen {

    /**
     * L'image à dessiner en arrière plan.
     */
    private static final ResourceLocation backgroundImage = new ResourceLocation(Reference.MODID,"textures/gui/title/mojang.png");
    private transient long updateCounter = 0;

    String chargementText = "§6Chargement§f de la porte ..."; // A vous de mettre ce que vous voulez !
    String serverName = "§6Paradoxal"; // A vous de mettre ce que vous voulez !
    String loading = "§6Connexion§7 au serveur ! ..."; // A vous de mettre ce que vous voulez !
    String bfsName = "§7Serveur"; // A vous de mettre ce que vous voulez !

    @Override
    public void initGui() {
        Main.logger.info("Info");
        this.buttonList.add(new GuiButton(9, this.width - 100, this.height - 30, 60, 20, "Annuler"));
    }
    public void updateScreen()
    {
        this.updateCounter += 1;
        if (this.updateCounter == 100) {
            FMLClientHandler.instance().connectToServerAtStartup("localhost",25565);
        }
        if (this.updateCounter >= 101) {
            this.mc.displayGuiScreen(new GuiMainMenu());
        }
    }

    public void drawBack() {
        GL11.glViewport(0, 0, 256, 256);
        this.mc.getTextureManager().bindTexture(this.backgroundImage);
        GL11.glViewport(0, 0, this.mc.displayWidth, this.mc.displayHeight);
        Tessellator tessellator = Tessellator.getInstance();
        tessellator.getBuffer().begin(7,DefaultVertexFormats.POSITION_TEX);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);
        tessellator.getBuffer().color(1.0F,1.0F,1.0F,1.0F);
        // On ajoute les vertices et leurs positions sur la texture.
        {
            tessellator.getBuffer().pos(0, 0, this.zLevel);
            tessellator.getBuffer().pos(0, this.height, this.zLevel);
            tessellator.getBuffer().pos(this.width, this.height, this.zLevel);
            tessellator.getBuffer().pos(this.width, 0, this.zLevel);
            tessellator.draw();
        }
    }

    public void drawScreen(int par1, int par2, float par3){
        drawBack();

        drawHorizontalLine(0, this.width, this.height - 47, 0xff000000);
        drawHorizontalLine(0, this.width, this.height - 46, 0xff737373);
        this.drawRect(0, this.height - 45, this.width, this.height, 0xff333333);
        // Barre de progression
        drawRect(this.width / 2 - 101, this.height - 28, this.width / 2 + 101, this.height - 15, 0xfd8d8d80);
        drawRect(this.width / 2 - 100, this.height - 27, this.width / 2 + 100, this.height - 16, 0xf0000000);
        drawRect(this.width / 2 - 100, this.height - 27, width / 2 - 100 + (int) updateCounter * 2, this.height - 16, 0xf00aa000); //Texte chargement
        this.drawCenteredString(this.fontRenderer, loading, this.width / 2, this.height - 40, 16777215);

        // Pourcentage
        String percent = updateCounter + "%";
        this.drawCenteredString(this.fontRenderer, percent, this.width / 2, this.height - 10, 16777215);

        // Avant nom serveur
        this.drawString(this.fontRenderer, bfsName, 10, this.height - 22, -1);

        // Nom du serveur
        this.drawString(this.fontRenderer, serverName, 10, this.height - 12, -1);

        GL11.glPushMatrix();
        {
            /**
             * Par combien faut-il multiplier la taille du message de bienvenue.
             */
            float scaleFactor = 2.0f;

            // On déplace l'origine jusqu'à l'endroit où l'on veut placer le message.
            this.translateToStringPos("§aBienvenue, §b" + this.mc.getSession().getUsername() + " §a!", scaleFactor, this.width / 2, 1);

            // On met à l'échelle selon la variable.
            GL11.glScalef(scaleFactor, scaleFactor, 1.0f);
            this.drawString(fontRenderer, "§aBienvenue, §b" + this.mc.getSession().getUsername() + " §a!", 0, 0, 0xf0c300);
        }
        GL11.glPopMatrix();

        super.drawScreen(par1, par2, par3);
    }

    protected void translateToStringPos(String text, float scale, int x, int y)
    {
        float stringWidth = this.fontRenderer.getStringWidth(text) * scale;
        GL11.glTranslatef(x - (stringWidth / 2f), y, 0.0f);
    }
    public void actionPerformed(GuiButton button)
    {
        if (button.id == 9) {
            this.mc.displayGuiScreen(new GuiMainMenu());
        }
    }
}
