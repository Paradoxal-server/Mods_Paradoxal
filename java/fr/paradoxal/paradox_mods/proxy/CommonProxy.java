package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.craft.Craft;
import fr.paradoxal.paradox_mods.init.ModRecipes;
import fr.paradoxal.paradox_mods.items.IFuelHandlerPara;
import net.minecraft.util.ResourceLocation;
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
		ResourceLocation b = new ResourceLocation("small_coal");
		new Craft().registercrafhammer(b);
		ResourceLocation a = new ResourceLocation("paradoxal_sword");
		new Craft().registerCraftDarkSword(a);
		ResourceLocation c = new ResourceLocation("paradoxal_shovel");
		new Craft().registerCraftDarkShovel(c);
		ResourceLocation d = new ResourceLocation("paradoxal_axe");
		new Craft().registerCraftDarkAxe(d);
	}
	
	public void postInit() {
        System.out.println("Paradoxal: Common - PostInit");
	}
}
