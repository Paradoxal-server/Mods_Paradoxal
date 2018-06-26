package fr.paradoxal.paradox_mods.init.Item;

import fr.paradoxal.paradox_mods.Main;
import net.minecraft.item.ItemSword;

public class SwordToolsBase extends ItemSword {

    public SwordToolsBase(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.paradoxalTabs);
    }
}
