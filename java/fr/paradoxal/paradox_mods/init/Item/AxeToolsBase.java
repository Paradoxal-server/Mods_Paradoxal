package fr.paradoxal.paradox_mods.init.Item;

import fr.paradoxal.paradox_mods.Main;
import net.minecraft.item.ItemAxe;

public class AxeToolsBase extends ItemAxe {

    public AxeToolsBase(String name,ToolMaterial material, float damage, float speed) {
        super(material, damage, speed);
        setRegistryName(name);
        setUnlocalizedName(name);
        setCreativeTab(Main.paradoxalTabs);
    }
}
