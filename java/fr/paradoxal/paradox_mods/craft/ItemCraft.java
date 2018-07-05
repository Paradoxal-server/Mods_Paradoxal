package fr.paradoxal.paradox_mods.craft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemCraft {
    public void addCraft(ResourceLocation name, ResourceLocation group, ItemStack itemStack, Ingredient[] ind) {
        GameRegistry.addShapelessRecipe(name, group, itemStack, ind);
    }

    public void addCraft(ResourceLocation name, ResourceLocation group, ItemStack itemStack, Object[] obj) {
        GameRegistry.addShapedRecipe(name, group, itemStack, obj);
    }

    public void addSmelteing(Block blocin, ItemStack itemStackOuput, float xp) {
        GameRegistry.addSmelting(blocin, itemStackOuput, xp);
    }

    public void addSmelteing(Item itemIn, ItemStack itemStackOuput, float xp) {
        GameRegistry.addSmelting(itemIn, itemStackOuput, xp);
    }

    public void addSmelteing(ItemStack itemStackIn, ItemStack itemStackOuput, float xp) {
        GameRegistry.addSmelting(itemStackIn, itemStackOuput, xp);
    }
}
