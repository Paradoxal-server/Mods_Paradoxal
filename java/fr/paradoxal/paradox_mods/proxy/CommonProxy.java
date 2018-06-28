package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.craft.Craft;
import fr.paradoxal.paradox_mods.init.ModRecipes;
import fr.paradoxal.paradox_mods.items.IFuelHandlerPara;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit() {

	}
	
	public void init()
	{
		new ModRecipes().RecipeSmetlingRecipes();
        GameRegistry.registerFuelHandler(new IFuelHandlerPara());
		ResourceLocation b = new ResourceLocation("small_coal");
		new Craft().registercrafhammer(b);
		ResourceLocation a = new ResourceLocation("paradoxal_sword");
		new Craft().registerCraftDarkSword(a);

	}
	
	public void postInit() {

	}
}
