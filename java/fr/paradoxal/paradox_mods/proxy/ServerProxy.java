package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.Main;

public class ServerProxy extends CommonProxy{
	
	@Override
	public void preInit() {
		super.preInit();
		Main.logger.debug("ServerProxy - init","Entrés en phase de preinit");
	}
	
	@Override
	public void init() {
		super.init();
		Main.logger.debug("ServerProxy - init","Entrés en phase de init");
	}
	@Override
	public void postInit() {
		super.postInit();
		Main.logger.debug("ServerProxy - init", "Entrés en phase de postinit");
	}
}
