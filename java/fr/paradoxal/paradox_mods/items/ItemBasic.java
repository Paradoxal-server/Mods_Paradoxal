package fr.paradoxal.paradox_mods.items;

import fr.paradoxal.paradox_mods.Main;
import net.minecraft.item.Item;

public class ItemBasic extends Item{

	public ItemBasic(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.paradoxalTabs);
	}
}
