package fr.paradoxal.paradox_mods.init;

import fr.paradoxal.paradox_mods.init.armor.ArmorHelmet;
import fr.paradoxal.paradox_mods.init.armor.ArmorbASE;
import fr.paradoxal.paradox_mods.materails.ArmorMateriels;
import fr.paradoxal.paradox_mods.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModArmor {
    public static Item paradoxal_helmet,lunar_helmet,solar_helmet,dark_helmet;
    public static Item paradoxal_chest,lunar_chest,solar_chest,dark_chest;
    public static Item paradoxal_leg,lunar_leg,solar_leg,dark_leg;
    public static Item paradoxal_boots,lunar_boots,solar_boots,dark_boots;
    private static Item[] items;

    public static void init() {
        paradoxal_helmet = new ArmorHelmet("paradoxal_helmet",ArmorMateriels.PARADOX_ARMOR_MATERIELS,0,EntityEquipmentSlot.HEAD);
        paradoxal_chest = new ArmorbASE("paradoxal_chest",ArmorMateriels.PARADOX_ARMOR_MATERIELS,0,EntityEquipmentSlot.CHEST);
        paradoxal_leg = new ArmorbASE("paradoxal_leg",ArmorMateriels.PARADOX_ARMOR_MATERIELS,1,EntityEquipmentSlot.LEGS);
        paradoxal_boots = new ArmorbASE("paradoxal_boots",ArmorMateriels.PARADOX_ARMOR_MATERIELS,0,EntityEquipmentSlot.FEET);

        lunar_helmet = new ArmorHelmet("lunar_helmet",ArmorMateriels.LUNAR_ARMOR_MATERIELS,0,EntityEquipmentSlot.HEAD);
        lunar_chest = new ArmorbASE("lunar_chest",ArmorMateriels.LUNAR_ARMOR_MATERIELS,0,EntityEquipmentSlot.CHEST);
        lunar_leg = new ArmorbASE("lunar_leg",ArmorMateriels.LUNAR_ARMOR_MATERIELS,1,EntityEquipmentSlot.LEGS);
        lunar_boots = new ArmorbASE("lunar_boots",ArmorMateriels.LUNAR_ARMOR_MATERIELS,0,EntityEquipmentSlot.FEET);

        items = new Item[]{
                paradoxal_helmet,paradoxal_chest,paradoxal_leg,paradoxal_boots,
                lunar_helmet,lunar_chest,lunar_leg,lunar_boots
        };

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
