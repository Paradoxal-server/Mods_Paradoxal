package fr.paradoxal.paradox_mods.init.Item;

import fr.paradoxal.paradox_mods.Main;
import net.minecraft.item.ItemPickaxe;

public class PickaxeToolsBase extends ItemPickaxe {

    public PickaxeToolsBase(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.paradoxalTabs);
    }
}
