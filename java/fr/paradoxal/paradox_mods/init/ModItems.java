package fr.paradoxal.paradox_mods.init;

import fr.paradoxal.paradox_mods.items.ItemBasic;
import fr.paradoxal.paradox_mods.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModItems {
	
	public static Item logo;
	private static Item paradoxal_ruby,lunar_ruby,solar_ruby,dark_ruby;
	private static Item[] items; 
	
	public static void init() {
		logo = new ItemBasic("logo");
		
		paradoxal_ruby = new ItemBasic("paradoxal_ruby");
		lunar_ruby = new ItemBasic("lunar_ruby");
		solar_ruby = new ItemBasic("solar_ruby");
		dark_ruby = new ItemBasic("dark_ruby");
		
		items = new Item[]{logo,paradoxal_ruby,lunar_ruby,solar_ruby,dark_ruby};
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void registermodels(ModelRegistryEvent e) {
		for (Item item : items)
		{
			registryModel(item);
		}
	}
	
	private static void registryModel(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID,item.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	public static Item[] getItems() {
		return items;
	}
	
}
