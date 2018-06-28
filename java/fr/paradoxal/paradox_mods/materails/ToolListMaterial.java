package fr.paradoxal.paradox_mods.materails;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ToolListMaterial {

	public static ToolMaterial paradoxal_Material = EnumHelper.addToolMaterial("paradoxal_Material", 3, 2000, 15.0F, 0.0F, 10);
	public static ToolMaterial lunar_Material = EnumHelper.addToolMaterial("lunar_Material",2,1000,8.0F,0.0F,14);
	public static ToolMaterial solar_Material = EnumHelper.addToolMaterial("solar_Material",2,1000,8.0F,0.0F,14);
	public static ToolMaterial dark_Material = EnumHelper.addToolMaterial("dark_Material",3,5000,20.0F,0.0F,10);

	public static ToolMaterial paradoxal_material_sword = EnumHelper.addToolMaterial("paradoxal_material_sword",3,2000,15.0F,5.0F,10);
	public static ToolMaterial lunar_material_sword = EnumHelper.addToolMaterial("lunar_material_sword",3,1000,8.0F,4.0F,14);
	public static ToolMaterial solar_material_sword = EnumHelper.addToolMaterial("solar_material_sword",3,1000,8.0F,4.0F,14);
	public static ToolMaterial dark_material_sword = EnumHelper.addToolMaterial("dark_material_sword",3,5000,20.0F,8.0F,10);
}
