package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.gui.GuiMainMenu;
import fr.paradoxal.paradox_mods.gui.newGuiConnecting;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit() {
		super.preInit();
		MinecraftForge.EVENT_BUS.register(new GuiMainMenu());
		System.out.println("Paradoxal: Client - preInit");
	}
	
	@Override
	public void init() {
		super.init();
		System.out.println("Paradoxal: Client - init");
	}
	
	@Override
	public void postInit() {
		super.postInit();
		System.out.println("Paradoxal: Client - Postinit");
	}
}
