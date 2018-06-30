package fr.paradoxal.paradox_mods.proxy;

import fr.paradoxal.paradox_mods.Main;
import fr.paradoxal.paradox_mods.craft.ItemCraft;
import fr.paradoxal.paradox_mods.init.ModArmor;
import fr.paradoxal.paradox_mods.init.ModBlocks;
import fr.paradoxal.paradox_mods.init.ModItems;
import fr.paradoxal.paradox_mods.init.ModsTools;
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
        Main.logger.debug("CommonProxy - init","Entrés en phase de preinit");
	}

	public void init()
	{
        Main.logger.debug("CommonProxy - init","Entrés en phase de init");
        GameRegistry.registerFuelHandler(new IFuelHandlerPara());
        crlcraft();

	}
	
	public void postInit() {
        Main.logger.debug("CommonProxy - init","Entrés en phase de postinit");
	}

	protected void crlcraft()
    {
        Main.logger.debug("CommonProxy - crlcraft","Création des craft");
        registercrafsphales("craft_small_coal",Items.COAL,ModItems.small_coal,9);
        registercraftShapeed("craft_coal",Items.COAL,1,new Object[]{"SSS","SSS","SSS",'S',ModItems.small_coal});
        registercraftShapeed("craft_paradoxal_axe",ModsTools.paradoxal_axe,1,new Object[]{" SS"," DS","D  ",'S',ModItems.paradoxal_ingot,'D',Items.STICK});
        registercraftShapeed("craft_paradoxal_shovel",ModsTools.paradoxal_shovel,1,new Object[]{"S","D","D",'S',ModItems.paradoxal_ingot,'D',Items.STICK});
        registercraftShapeed("craft_paradoxal_pickaxe",ModsTools.paradoxal_pickaxe,1,new Object[]{"SSS"," D "," D ",'S',ModItems.paradoxal_ingot,'D',Items.STICK});
        registercraftShapeed("craft_paradoxal_sword",ModsTools.paradoxal_pickaxe,1,new Object[]{"  S"," S ","D  ",'S',ModItems.paradoxal_ingot,'D',Items.STICK});

        registercraftShapeed("craft_lunar_axe",ModsTools.lunar_axe,1,new Object[]{" SS"," DS","D  ",'S',ModItems.lunar_ingot,'D',Items.STICK});
        registercraftShapeed("craft_lunar_shovel",ModsTools.lunar_shovel,1,new Object[]{"S","D","D",'S',ModItems.lunar_ingot,'D',Items.STICK});
        registercraftShapeed("craft_lunar_pickaxe",ModsTools.lunar_pickaxe,1,new Object[]{"SSS"," D "," D ",'S',ModItems.lunar_ingot,'D',Items.STICK});
        registercraftShapeed("craft_lunar_sword",ModsTools.lunar_sword,1,new Object[]{"  S"," S ","D  ",'S',ModItems.lunar_ingot,'D',Items.STICK});

        registercraftShapeed("craft_solar_axe",ModsTools.solar_axe,1,new Object[]{" SS"," DS","D  ",'S',ModItems.solar_ingot,'D',Items.STICK});
        registercraftShapeed("craft_solar_shovel",ModsTools.solar_shovel,1,new Object[]{"S","D","D",'S',ModItems.solar_ingot,'D',Items.STICK});
        registercraftShapeed("craft_solar_pickaxe",ModsTools.lunar_pickaxe,1,new Object[]{"SSS"," D "," D ",'S',ModItems.solar_ingot,'D',Items.STICK});
        registercraftShapeed("craft_solar_sword",ModsTools.lunar_sword,1,new Object[]{"  S"," S ","D  ",'S',ModItems.solar_ingot,'D',Items.STICK});

        registercraftShapeed("craft_dark_axe",ModsTools.dark_axe,1,new Object[]{" SS"," DS","D  ",'S',ModItems.dark_ingot,'D',Items.STICK});
        registercraftShapeed("craft_dark_shovel",ModsTools.dark_shovel,1,new Object[]{"S","D","D",'S',ModItems.dark_ingot,'D',Items.STICK});
        registercraftShapeed("craft_dark_pickaxe",ModsTools.dark_pickaxe,1,new Object[]{"SSS"," D "," D ",'S',ModItems.dark_ingot,'D',Items.STICK});
        registercraftShapeed("craft_dark_sword",ModsTools.dark_sword,1,new Object[]{"  S"," S ","D  ",'S',ModItems.dark_ingot,'D',Items.STICK});

        registercraftShapeed("craft_armor_paradoxal_helmet",ModArmor.paradoxal_helmet,1,new Object[]{"SSS","S S",'S',ModItems.paradoxal_ingot});
        registercraftShapeed("craft_armor_paradoxal_chest",ModArmor.paradoxal_chest,1,new Object[]{"S S","SSS","SSS",'S',ModItems.paradoxal_ingot});
        registercraftShapeed("craft_armor_paradoxal_leg",ModArmor.paradoxal_leg,1,new Object[]{"SSS","S S","S S",'S',ModItems.paradoxal_ingot});
        registercraftShapeed("craft_armor_paradoxal_boots",ModArmor.paradoxal_boots,1,new Object[]{"S S","S S",'S',ModItems.paradoxal_ingot});

        registercraftShapeed("craft_armor_lunar_helmet",ModArmor.lunar_helmet,1,new Object[]{"SSS","S S",'S',ModItems.lunar_ingot});
        registercraftShapeed("craft_armor_lunar_chest",ModArmor.lunar_chest,1,new Object[]{"S S","SSS","SSS",'S',ModItems.lunar_ingot});
        registercraftShapeed("craft_armor_lunar_leg",ModArmor.lunar_leg,1,new Object[]{"SSS","S S","S S",'S',ModItems.lunar_ingot});
        registercraftShapeed("craft_armor_lunar_boots",ModArmor.lunar_boots,1,new Object[]{"S S","S S",'S',ModItems.lunar_ingot});

        registercraftShapeed("craft_armor_solar_helmet",ModArmor.solar_helmet,1,new Object[]{"SSS","S S",'S',ModItems.solar_ingot});
        registercraftShapeed("craft_armor_solar_chest",ModArmor.solar_chest,1,new Object[]{"S S","SSS","SSS",'S',ModItems.solar_ingot});
        registercraftShapeed("craft_armor_solar_leg",ModArmor.solar_leg,1,new Object[]{"SSS","S S","S S",'S',ModItems.solar_ingot});
        registercraftShapeed("craft_armor_solar_boots",ModArmor.solar_boots,1,new Object[]{"S S","S S",'S',ModItems.solar_ingot});

        registercraftShapeed("craft_armor_dark_helmet",ModArmor.dark_helmet,1,new Object[]{"SSS","S S",'S',ModItems.dark_ingot});
        registercraftShapeed("craft_armor_dark_chest",ModArmor.dark_chest,1,new Object[]{"S S","SSS","SSS",'S',ModItems.dark_ingot});
        registercraftShapeed("craft_armor_dark_leg",ModArmor.dark_leg,1,new Object[]{"SSS","S S","S S",'S',ModItems.dark_ingot});
        registercraftShapeed("craft_armor_dark_boots",ModArmor.dark_boots,1,new Object[]{"S S","S S",'S',ModItems.dark_ingot});

        itemCraft.addSmelteing(ModBlocks.paradox_ore,new ItemStack(ModItems.paradoxal_ingot),5.0F);
        itemCraft.addSmelteing(ModBlocks.solar_ore,new ItemStack(ModItems.solar_ingot),4.0F);
        itemCraft.addSmelteing(ModBlocks.lunar_ore,new ItemStack(ModItems.lunar_ingot),4.0F);
        itemCraft.addSmelteing(ModBlocks.dark_ore,new ItemStack(ModItems.dark_ingot),8.0F);
    }

	private void registercrafsphales(String namea,Item itemsInput, Item itemsOutput,int count)
    {
        Main.logger.debug("Common - registercrafsphales","Création du craft: "+namea);
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
        Main.logger.debug("Common - registercraftShapeed","Création du craft: "+namea);
        ResourceLocation name = new ResourceLocation(Reference.MODID,namea);
        ResourceLocation name2 = null;
        itemCraft.addCraft(name,name2,new ItemStack(itemStackOut,count),obj);
    }
}
