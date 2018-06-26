package fr.paradoxal.paradox_mods.init.Item;

import fr.paradoxal.paradox_mods.Main;
import javafx.scene.paint.Material;
import net.minecraft.item.ItemHoe;

public class HoeToolsBase extends ItemHoe {

    public HoeToolsBase(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.paradoxalTabs);
    }
}
