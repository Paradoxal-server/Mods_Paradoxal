package fr.paradoxal.paradox_mods.materails;

import fr.paradoxal.paradox_mods.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMateriels {
    public static ItemArmor.ArmorMaterial PARADOX_ARMOR_MATERIELS = EnumHelper.addArmorMaterial("paradoxal_armor",Reference.MODID+":paradoxal_armor",2000,new int[]{3,5,4,2},10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,8F);
    public static ItemArmor.ArmorMaterial SOLAR_ARMOR_MATERIELS = EnumHelper.addArmorMaterial("solar_armor",Reference.MODID+":solar_armor",1000,new int[]{3,5,4,2},14,SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,8F);
    public static ItemArmor.ArmorMaterial LUNAR_ARMOR_MATERIELS = EnumHelper.addArmorMaterial("lunar_armor",Reference.MODID+":lunar_armor",1000,new int[]{3,5,4,2},14,SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,8f);
    public static ItemArmor.ArmorMaterial DARK_AMOR_MATERIEKS = EnumHelper.addArmorMaterial("dark_armor",Reference.MODID+":dark_armor",5000,new int[]{3,5,4,2},10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,10F);
}
