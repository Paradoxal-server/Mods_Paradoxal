package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.Main;
import fr.paradoxal.paradox_mods.gui.GuiMainMenu;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit() {
		super.preInit();
		MinecraftForge.EVENT_BUS.register(new GuiMainMenu());
		Main.logger.debug("ClientProxy - init","Entrés en phase de preinit");
	}
	
	@Override
	public void init() {
		super.init();
		Main.logger.debug("ClientProxy - init","Entrés en phase de init");
	}
	
	@Override
	public void postInit() {
		super.postInit();
		Main.logger.debug("ClientProxy - init", "Entrés en phase de postinit");
	}
}
