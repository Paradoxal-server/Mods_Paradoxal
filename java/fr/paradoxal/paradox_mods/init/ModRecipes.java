package fr.paradoxal.paradox_mods.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public void RecipeSmetlingRecipes() {
		GameRegistry.addSmelting(ModBlocks.dark_ore, new ItemStack(ModItems.dark_ingot,1),5F);
		GameRegistry.addSmelting(ModBlocks.lunar_ore, new ItemStack(ModItems.lunar_ingot,1),3F);
		GameRegistry.addSmelting(ModBlocks.solar_ore, new ItemStack(ModItems.solar_ingot,1), 3F);
		GameRegistry.addSmelting(ModBlocks.paradox_ore, new ItemStack(ModItems.paradoxal_ingot,1), 10F);
		GameRegistry.addSmelting(ModItems.dark_dust,new ItemStack(ModItems.dark_ingot,1),5);
		GameRegistry.addSmelting(ModItems.lunar_dust,new ItemStack(ModItems.lunar_ingot,1),3F);
		GameRegistry.addSmelting(ModItems.solar_dust,new ItemStack(ModItems.solar_ingot,1),3F);
		GameRegistry.addSmelting(ModItems.paradoxal_dust,new ItemStack(ModItems.paradoxal_ingot,1),10F);
	}
}
