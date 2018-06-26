package fr.paradoxal.paradox_mods.init.Item;

import fr.paradoxal.paradox_mods.Main;
import net.minecraft.item.ItemSpade;

public class ShovelToolsBase extends ItemSpade {

    public ShovelToolsBase(String name,ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.paradoxalTabs);
    }
}
