package fr.paradoxal.paradox_mods.init.Item;

import fr.paradoxal.paradox_mods.Main;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class SwordToolsBase extends ItemSword {

    public SwordToolsBase(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.paradoxalTabs);
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        super.onArmorTick(world, player, itemStack);
        itemStack.addEnchantment(Enchantments.SHARPNESS,5);
    }
}
