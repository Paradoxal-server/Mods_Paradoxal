package fr.paradoxal.paradox_mods.event;

import fr.paradoxal.paradox_mods.init.ModBlocks;
import fr.paradoxal.paradox_mods.init.ModItems;
import fr.paradoxal.paradox_mods.init.ModsTools;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistringEvent {

	@SubscribeEvent
	public void onItemRegistryt(RegistryEvent.Register<Item> e)
	{
		ModItems.init();
		e.getRegistry().registerAll(ModItems.getItems());
	}

	@SubscribeEvent
	public void onToolsRegistry(RegistryEvent.Register<Item> e)
	{
		ModsTools.init();
		e.getRegistry().registerAll(ModsTools.getItems());
	}
	@SubscribeEvent
	public void onBlockRegistry(RegistryEvent.Register<Block> e) {
		ModBlocks.init();
		e.getRegistry().registerAll(ModBlocks.getBlocks());
	}
}
