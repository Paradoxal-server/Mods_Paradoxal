package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.Main;
import fr.paradoxal.paradox_mods.craft.ItemCraft;
import fr.paradoxal.paradox_mods.init.ModBlocks;
import fr.paradoxal.paradox_mods.init.ModItems;
import fr.paradoxal.paradox_mods.items.IFuelHandlerPara;
import fr.paradoxal.paradox_mods.util.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    private ItemCraft itemCraft= new ItemCraft();

	public void preInit() {
        System.out.println("Paradoxal: Common - preInit");
	}

	public void init()
	{
        System.out.println("Paradoxal: Common - init");
        GameRegistry.registerFuelHandler(new IFuelHandlerPara());

        registercrafsphales("craft_small_coal",Items.COAL,ModItems.small_coal,9);
        registercraftShapeed("craft_coal",Items.COAL,1,new Object[]{"SSS","SSS","SSS",'S',ModItems.small_coal});
        itemCraft.addSmelteing(ModBlocks.paradox_ore,new ItemStack(ModItems.paradoxal_ingot),5.0F);
        itemCraft.addSmelteing(ModBlocks.solar_ore,new ItemStack(ModItems.solar_ingot),4.0F);
        itemCraft.addSmelteing(ModBlocks.lunar_ore,new ItemStack(ModItems.lunar_ingot),4.0F);
        itemCraft.addSmelteing(ModBlocks.dark_ore,new ItemStack(ModItems.dark_ingot),8.0F);
	}
	
	public void postInit() {
        System.out.println("Paradoxal: Common - PostInit");
	}

	private void registercrafsphales(String namea,Item itemsInput, Item itemsOutput,int count)
    {
        Main.logger.info("Paradoxal: Common - Craft Sphalessed - Craft de "+namea);
        Ingredient and[];
        ResourceLocation name;
        ResourceLocation name2;
        name = new ResourceLocation(Reference.MODID,namea);
        name2 = null;
        and = new Ingredient[]{Ingredient.fromItem(itemsInput)};
        itemCraft.addCraft(name,name2,new ItemStack(itemsOutput,count),and);
    }

    private void registercraftShapeed(String namea,Item itemStackOut,int count,Object[] obj)
    {
        Main.logger.info("Paradoxal: Common - Craft Sphaeed - Craft de "+namea);
        ResourceLocation name = new ResourceLocation(Reference.MODID,namea);
        ResourceLocation name2 = null;
        itemCraft.addCraft(name,name2,new ItemStack(itemStackOut,count),obj);
    }
}
