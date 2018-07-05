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
    private ItemCraft itemCraft = new ItemCraft();

    public void preInit() {
        Main.logger.debug("CommonProxy - init", "Entrés en phase de preinit");
    }

    public void init() {
        Main.logger.debug("CommonProxy - init", "Entrés en phase de init");
        GameRegistry.registerFuelHandler(new IFuelHandlerPara());
        crlcraft();

    }

    public void postInit() {
        Main.logger.debug("CommonProxy - init", "Entrés en phase de postinit");
    }

    protected void crlcraft() {
        Main.logger.debug("CommonProxy - crlcraft", "Création des craft");
        registercrafsphales("craft_small_coal", Items.COAL, ModItems.small_coal, 9);
        registercraftShapeed("craft_coal", Items.COAL, 1, new Object[]{"SSS", "SSS", "SSS", 'S', ModItems.small_coal});
        registercraftShapeed("craft_paradoxal_axe", ModsTools.paradoxal_axe, 1, new Object[]{" SS", " DS", "D  ", 'S', ModItems.paradoxal_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_paradoxal_shovel", ModsTools.paradoxal_shovel, 1, new Object[]{"S", "D", "D", 'S', ModItems.paradoxal_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_paradoxal_pickaxe", ModsTools.paradoxal_pickaxe, 1, new Object[]{"SSS", " D ", " D ", 'S', ModItems.paradoxal_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_paradoxal_sword", ModsTools.paradoxal_pickaxe, 1, new Object[]{"  S", " S ", "D  ", 'S', ModItems.paradoxal_ingot, 'D', Items.STICK});

        registercraftShapeed("craft_lunar_axe", ModsTools.lunar_axe, 1, new Object[]{" SS", " DS", "D  ", 'S', ModItems.lunar_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_lunar_shovel", ModsTools.lunar_shovel, 1, new Object[]{"S", "D", "D", 'S', ModItems.lunar_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_lunar_pickaxe", ModsTools.lunar_pickaxe, 1, new Object[]{"SSS", " D ", " D ", 'S', ModItems.lunar_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_lunar_sword", ModsTools.lunar_sword, 1, new Object[]{"  S", " S ", "D  ", 'S', ModItems.lunar_ingot, 'D', Items.STICK});

        registercraftShapeed("craft_solar_axe", ModsTools.solar_axe, 1, new Object[]{" SS", " DS", "D  ", 'S', ModItems.solar_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_solar_shovel", ModsTools.solar_shovel, 1, new Object[]{"S", "D", "D", 'S', ModItems.solar_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_solar_pickaxe", ModsTools.lunar_pickaxe, 1, new Object[]{"SSS", " D ", " D ", 'S', ModItems.solar_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_solar_sword", ModsTools.lunar_sword, 1, new Object[]{"  S", " S ", "D  ", 'S', ModItems.solar_ingot, 'D', Items.STICK});

        registercraftShapeed("craft_dark_axe", ModsTools.dark_axe, 1, new Object[]{" SS", " DS", "D  ", 'S', ModItems.dark_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_dark_shovel", ModsTools.dark_shovel, 1, new Object[]{"S", "D", "D", 'S', ModItems.dark_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_dark_pickaxe", ModsTools.dark_pickaxe, 1, new Object[]{"SSS", " D ", " D ", 'S', ModItems.dark_ingot, 'D', Items.STICK});
        registercraftShapeed("craft_dark_sword", ModsTools.dark_sword, 1, new Object[]{"  S", " S ", "D  ", 'S', ModItems.dark_ingot, 'D', Items.STICK});

        registercraftShapeed("craft_armor_paradoxal_helmet", ModArmor.paradoxal_helmet, 1, new Object[]{"SSS", "S S", 'S', ModItems.paradoxal_ingot});
        registercraftShapeed("craft_armor_paradoxal_chest", ModArmor.paradoxal_chest, 1, new Object[]{"S S", "SSS", "SSS", 'S', ModItems.paradoxal_ingot});
        registercraftShapeed("craft_armor_paradoxal_leg", ModArmor.paradoxal_leg, 1, new Object[]{"SSS", "S S", "S S", 'S', ModItems.paradoxal_ingot});
        registercraftShapeed("craft_armor_paradoxal_boots", ModArmor.paradoxal_boots, 1, new Object[]{"S S", "S S", 'S', ModItems.paradoxal_ingot});

        registercraftShapeed("craft_armor_lunar_helmet", ModArmor.lunar_helmet, 1, new Object[]{"SSS", "S S", 'S', ModItems.lunar_ingot});
        registercraftShapeed("craft_armor_lunar_chest", ModArmor.lunar_chest, 1, new Object[]{"S S", "SSS", "SSS", 'S', ModItems.lunar_ingot});
        registercraftShapeed("craft_armor_lunar_leg", ModArmor.lunar_leg, 1, new Object[]{"SSS", "S S", "S S", 'S', ModItems.lunar_ingot});
        registercraftShapeed("craft_armor_lunar_boots", ModArmor.lunar_boots, 1, new Object[]{"S S", "S S", 'S', ModItems.lunar_ingot});

        registercraftShapeed("craft_armor_solar_helmet", ModArmor.solar_helmet, 1, new Object[]{"SSS", "S S", 'S', ModItems.solar_ingot});
        registercraftShapeed("craft_armor_solar_chest", ModArmor.solar_chest, 1, new Object[]{"S S", "SSS", "SSS", 'S', ModItems.solar_ingot});
        registercraftShapeed("craft_armor_solar_leg", ModArmor.solar_leg, 1, new Object[]{"SSS", "S S", "S S", 'S', ModItems.solar_ingot});
        registercraftShapeed("craft_armor_solar_boots", ModArmor.solar_boots, 1, new Object[]{"S S", "S S", 'S', ModItems.solar_ingot});

        registercraftShapeed("craft_armor_dark_helmet", ModArmor.dark_helmet, 1, new Object[]{"SSS", "S S", 'S', ModItems.dark_ingot});
        registercraftShapeed("craft_armor_dark_chest", ModArmor.dark_chest, 1, new Object[]{"S S", "SSS", "SSS", 'S', ModItems.dark_ingot});
        registercraftShapeed("craft_armor_dark_leg", ModArmor.dark_leg, 1, new Object[]{"SSS", "S S", "S S", 'S', ModItems.dark_ingot});
        registercraftShapeed("craft_armor_dark_boots", ModArmor.dark_boots, 1, new Object[]{"S S", "S S", 'S', ModItems.dark_ingot});

        registercraftShapeed("craft_paradoxal_ruby", ModItems.paradoxal_ruby, 10, new Object[]{"SX", 'S', ModBlocks.paradox_ore, 'X', Items.TNT_MINECART});
        registercraftShapeed("craft_dark_ruby", ModItems.dark_ruby, 10, new Object[]{"SX", 'S', ModBlocks.dark_ore, 'X', Items.TNT_MINECART});
        registercraftShapeed("craft_lunar_ruby", ModItems.lunar_ruby, 10, new Object[]{"SX", 'S', ModBlocks.lunar_ore, 'X', Items.TNT_MINECART});
        registercraftShapeed("craft_solar_ruby", ModItems.solar_ruby, 10, new Object[]{"SX", 'S', ModBlocks.solar_ore, 'X', Items.TNT_MINECART});

        registercraftShapeed("craft_dragon ingot", ModItems.dragon_ingot, 1, new Object[]{" X ", "OVN", " U ", 'X', ModItems.paradoxal_ingot, 'O', ModItems.dark_ingot, 'V', Items.NETHER_STAR, 'N', ModItems.solar_ingot, 'U', ModItems.lunar_ingot});
        registercraftShapeed("craft_dragon_ruby", ModItems.dragon_ruby, 10, new Object[]{"XV", 'X', ModItems.dragon_ingot, 'V', Items.TNT_MINECART});
        registercraftShapeed("craft_astral_core", ModItems.astrral_core, 1, new Object[]{" X ", "VBN", " O ", 'X', ModItems.dragon_ruby, 'V', ModItems.dark_ruby, 'B', ModItems.dragon_ingot, 'N', ModItems.lunar_ruby, 'O', ModItems.solar_ruby});

        registercraftShapeed("craft_dragon_sword", ModsTools.dragon_sword, 1, new Object[]{"  B", " O ", "X  ", 'X', Items.STICK, 'O', ModItems.astrral_core, 'B', ModItems.dragon_ingot});
        registercraftShapeed("craft_dragon_pickaxe", ModsTools.dragon_pickaxe, 1, new Object[]{"XOX", " B ", " B ", 'X', ModItems.dragon_ingot, 'O', ModItems.astrral_core, 'B', Items.STICK});
        registercraftShapeed("craft_dragon_axe", ModsTools.dragon_axe, 1, new Object[]{" XO", " BX", "B  ", 'X', ModItems.dragon_ingot, 'O', ModItems.astrral_core, 'B', Items.STICK});
        registercraftShapeed("craft_dragon_shovel", ModsTools.dragon_shovel, 1, new Object[]{" X ", " O ", " B ", 'X', ModItems.dragon_ingot, 'O', ModItems.astrral_core, 'B', Items.STICK});

        registercraftShapeed("craft_armor_dragon_helmet", ModArmor.dragon_helmet, 1, new Object[]{"BXO", "X X", 'X', ModItems.dragon_ingot, 'B', ModItems.dragon_ruby, 'O', ModItems.astrral_core});
        registercraftShapeed("craft_armor_dragon_chest", ModArmor.dragon_chest, 1, new Object[]{"X X", "XBX", "XOX", 'X', ModItems.dragon_ingot, 'B', ModItems.dragon_ruby, 'O', ModItems.astrral_core});
        registercraftShapeed("craft_armor_dragon_leg", ModArmor.dragon_leg, 1, new Object[]{"BXO", "X X", "X X", 'X', ModItems.dragon_ingot, 'B', ModItems.dragon_ruby, 'O', ModItems.astrral_core});
        registercraftShapeed("craft_armor_dragon_boots", ModArmor.dragon_boots, 1, new Object[]{"B O", "X X", 'X', ModItems.dragon_ingot, 'B', ModItems.dragon_ruby, 'O', ModItems.astrral_core});

        itemCraft.addSmelteing(ModBlocks.paradox_ore, new ItemStack(ModItems.paradoxal_ingot), 5.0F);
        itemCraft.addSmelteing(ModBlocks.solar_ore, new ItemStack(ModItems.solar_ingot), 4.0F);
        itemCraft.addSmelteing(ModBlocks.lunar_ore, new ItemStack(ModItems.lunar_ingot), 4.0F);
        itemCraft.addSmelteing(ModBlocks.dark_ore, new ItemStack(ModItems.dark_ingot), 8.0F);
        itemCraft.addSmelteing(ModItems.dark_dust, new ItemStack(ModItems.dark_ingot), 4.0F);
        itemCraft.addSmelteing(ModItems.lunar_dust, new ItemStack(ModItems.lunar_ingot), 2.0F);
        itemCraft.addSmelteing(ModItems.solar_dust, new ItemStack(ModItems.solar_ingot), 2.0F);
        itemCraft.addSmelteing(ModItems.paradoxal_dust, new ItemStack(ModItems.paradoxal_ingot), 2.5F);
    }

    private void registercrafsphales(String namea, Item itemsInput, Item itemsOutput, int count) {
        Main.logger.debug("Common - registercrafsphales", "Création du craft: " + namea);
        Ingredient and[];
        ResourceLocation name;
        ResourceLocation name2;
        name = new ResourceLocation(Reference.MODID, namea);
        name2 = null;
        and = new Ingredient[]{Ingredient.fromItem(itemsInput)};
        itemCraft.addCraft(name, name2, new ItemStack(itemsOutput, count), and);
    }

    private void registercraftShapeed(String namea, Item itemStackOut, int count, Object[] obj) {
        Main.logger.debug("Common - registercraftShapeed", "Création du craft: " + namea);
        ResourceLocation name = new ResourceLocation(Reference.MODID, namea);
        ResourceLocation name2 = null;
        itemCraft.addCraft(name, name2, new ItemStack(itemStackOut, count), obj);
    }
}
