package fr.paradoxal.paradox_mods.craft;

import fr.paradoxal.paradox_mods.init.ModItems;
import fr.paradoxal.paradox_mods.init.ModsTools;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Craft {

    public void registercrafhammer(ResourceLocation name)
    {
        GameRegistry.addShapedRecipe(name,null,new ItemStack(ModItems.small_coal,9),"I",'I',Items.COAL);
    }

    public void registerCraftDarkSword(ResourceLocation name){
        GameRegistry.addShapedRecipe(name,null,new ItemStack(ModsTools.dark_sword,1)," I ","CXB"," V ","I",ModsTools.paradoxal_sword,"C",ModsTools.lunar_sword,"X",ModItems.dark_ingot,"B",ModsTools.solar_sword,"V",ModItems.dark_ruby);
    }
}
