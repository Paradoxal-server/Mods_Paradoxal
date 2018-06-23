package fr.paradoxal.paradox_mods.init;

import fr.paradoxal.paradox_mods.items.BlockBase;
import fr.paradoxal.paradox_mods.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModBlocks {
	
	private static Block dark_ore,lunar_ore,paradox_ore,solar_ore;
	private static Block[] blocks;
	
	public static void init() {
		dark_ore = new BlockBase("dark_ore", Material.ROCK);
		lunar_ore = new BlockBase("lunar_ore", Material.ROCK);
		paradox_ore = new BlockBase("paradox_ore", Material.ROCK);
		solar_ore = new BlockBase("solar_ore", Material.ROCK);
		
		blocks = new Block[]{dark_ore,lunar_ore,paradox_ore,solar_ore};
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void registermodels(ModelRegistryEvent e) {
		for (Block block : blocks)
		{
			registryModel(block);
		}
	}
	
	private static void registryModel(Block block) {
		ItemBlock ib = new ItemBlock(block);
		ib.setRegistryName(block.getRegistryName());
		GameRegistry.findRegistry(Item.class).register(ib);
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID,block.getUnlocalizedName().substring(5)), "inventory"));
	}
	public static Block[] getBlocks() {
		return blocks;
	}
	
}

