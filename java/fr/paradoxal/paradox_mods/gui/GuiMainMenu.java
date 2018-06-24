package fr.paradoxal.paradox_mods.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiWorldSelection;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiMainMenu extends GuiScreen {
    public GuiScreen gui;
    public net.minecraft.client.gui.GuiMainMenu main;
    @SubscribeEvent
    public void OnInitGui(GuiScreenEvent.InitGuiEvent.Post event)
    {
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
            }
            int i = gui.height/ 4 + 20;
            event.getButtonList().add(new GuiButton(30,gui.width/2,i+24,100,20,"Serveur"){
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    Minecraft.getMinecraft().displayGuiScreen(new newGuiConnecting());
                }
            });
            int ia = gui.height/ 4 + 20;
            event.getButtonList().add(new GuiButton(31,gui.width/2-100,ia+24,100,20,"Solo"){
                @Override
                public void mouseReleased(int mouseX, int mouseY) {
                    Minecraft.getMinecraft().displayGuiScreen(new GuiWorldSelection(gui));
                }
            });

        }
    }
}
