package fr.paradoxal.paradox_mods.items;

import fr.paradoxal.paradox_mods.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block{

	public BlockBase(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.paradoxalTabs);
	}

}
