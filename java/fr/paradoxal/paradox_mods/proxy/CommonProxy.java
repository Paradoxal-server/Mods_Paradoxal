package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.init.ModRecipes;
import fr.paradoxal.paradox_mods.items.IFuelHandlerPara;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit() {
        System.out.println("Paradoxal: Common - preInit");
	}
	
	public void init()
	{
        System.out.println("Paradoxal: Common - init");
		new ModRecipes().RecipeSmetlingRecipes();
        GameRegistry.registerFuelHandler(new IFuelHandlerPara());
	}
	
	public void postInit() {
        System.out.println("Paradoxal: Common - PostInit");
	}
}
