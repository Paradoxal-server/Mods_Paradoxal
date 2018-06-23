package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.init.ModRecipes;
import fr.paradoxal.paradox_mods.items.IFuelHandlerPara;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit() {

	}
	
	public void init()
	{
		new ModRecipes().RecipeSmetlingRecipes();
        GameRegistry.registerFuelHandler(new IFuelHandlerPara());
	}
	
	public void postInit() {

	}
}
