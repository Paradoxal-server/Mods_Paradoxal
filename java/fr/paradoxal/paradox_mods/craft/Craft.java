package fr.paradoxal.paradox_mods.craft;

import fr.paradoxal.paradox_mods.init.ModItems;
import fr.paradoxal.paradox_mods.init.ModsTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Craft {

    public void registercrafhammer(ResourceLocation name,ResourceLocation name2)
    {
        GameRegistry.addShapedRecipe(name2,null,new ItemStack(ModItems.small_coal,9),"I",'I',Items.COAL);
}
}
