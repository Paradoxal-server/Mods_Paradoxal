package fr.paradoxal.paradox_mods.gui;

import fr.paradoxal.paradox_mods.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiWorldSelection;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiMainMenu extends GuiScreen {

    public GuiScreen gui;
    public net.minecraft.client.gui.GuiMainMenu main;
    public static Minecraft mc = Minecraft.getMinecraft();
    @SubscribeEvent
    public void OnInitGui(GuiScreenEvent.InitGuiEvent.Post event)
    {
        Main.logger.debug("GuiMainMenu","Menu principale");
        gui = event.getGui();
        if(gui instanceof net.minecraft.client.gui.GuiMainMenu) {
            for (Object b : event.getButtonList()) {
                if (((GuiButton) b).id == 14) {
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if (((GuiButton) b).id == 2){
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible =false;
                }
                if (((GuiButton) b).id == 6) {
                    ((GuiButton) b).width = ((GuiButton) b).width+100;
                }
                if (((GuiButton) b).id == 1){
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if(((GuiButton) b).id == 5){
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if(((GuiButton) b).id == 4){
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if(((GuiButton) b).id == 6){
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
                if(((GuiButton) b).id  == 0){
                    ((GuiButton) b).enabled = false;
                    ((GuiButton) b).visible = false;
                }
            }
            int i = gui.height/ 4 + 20;
            event.getButtonList().add(new GuiButton(30,gui.width/2+40,i+44,100,20,"Serveur"){
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    Minecraft.getMinecraft().displayGuiScreen(new newGuiConnecting());
                }
            });
            int ia = gui.height/ 4 + 20;
            event.getButtonList().add(new GuiButton(31,gui.width/2-140,ia+44,100,20,"Solo"){
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    Minecraft.getMinecraft().displayGuiScreen(new GuiWorldSelection(gui));
                }
            });

            int iaa = gui.height/ 4 +100;
            event.getButtonList().add(new GuiButton(32,gui.width/2-100,iaa,75,20,"Mods"){
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    Minecraft.getMinecraft().displayGuiScreen(new net.minecraftforge.fml.client.GuiModList(main));
                }
            });
            int iaaa = gui.height/4 +100;
            event.getButtonList().add(new GuiButton(33,gui.width/2+20,iaaa,75,20,"Options"){
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    Minecraft.getMinecraft().displayGuiScreen(new GuiOptions(gui, Minecraft.getMinecraft().gameSettings));
                }
            });
        }
    }
}
