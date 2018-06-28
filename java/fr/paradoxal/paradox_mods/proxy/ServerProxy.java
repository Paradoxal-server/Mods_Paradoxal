package fr.paradoxal.paradox_mods.proxy;

public class ServerProxy extends CommonProxy{
	
	@Override
	public void preInit() {
		super.preInit();
		System.out.println("Paradoxal: Server - preInit");
	}
	
	@Override
	public void init() {
		super.init();
		System.out.println("Paradoxal: Server - init");
	}
	@Override
	public void postInit() {
		super.postInit();
		System.out.println("Paradoxal: Server - postInit");
	}


}
