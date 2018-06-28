package fr.paradoxal.paradox_mods.init;

import fr.paradoxal.paradox_mods.init.Item.AxeToolsBase;
import fr.paradoxal.paradox_mods.init.Item.PickaxeToolsBase;
import fr.paradoxal.paradox_mods.init.Item.ShovelToolsBase;
import fr.paradoxal.paradox_mods.init.Item.SwordToolsBase;
import fr.paradoxal.paradox_mods.materails.ToolListMaterial;
import fr.paradoxal.paradox_mods.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber(modid=Reference.MODID)
public class ModsTools  {

    public static Item paradoxal_pickaxe,lunar_pickaxe,solar_pickaxe,dark_pickaxe;
    public static Item paradoxal_axe,lunar_axe,solar_axe,dark_axe;
    public static Item paradoxal_shovel,lunar_shovel,solar_shovel,dark_shovel;
    public static Item paradoxal_sword,lunar_sword,solar_sword,dark_sword;
    private static Item[] items;

    public static void init() {

        paradoxal_pickaxe = new PickaxeToolsBase("paradoxal_pickaxe",ToolListMaterial.paradoxal_Material);
        lunar_pickaxe = new PickaxeToolsBase("lunar_pickaxe",ToolListMaterial.lunar_Material);
        solar_pickaxe = new PickaxeToolsBase("solar_pickaxe",ToolListMaterial.solar_Material);
        dark_pickaxe = new PickaxeToolsBase("dark_pickaxe",ToolListMaterial.dark_Material);

        paradoxal_axe = new AxeToolsBase("paradoxal_axe",ToolListMaterial.paradoxal_Material,0.0f,0.0f);
        lunar_axe = new AxeToolsBase("lunar_axe",ToolListMaterial.lunar_Material,0.0f,0.0f);
        solar_axe = new AxeToolsBase("solar_axe",ToolListMaterial.solar_Material,0.0f,0.0f);
        dark_axe = new AxeToolsBase("dark_axe",ToolListMaterial.dark_Material,0.0f,0.0f);

        paradoxal_shovel = new ShovelToolsBase("paradoxal_shovel",ToolListMaterial.paradoxal_Material);
        lunar_shovel = new ShovelToolsBase("lunar_shovel",ToolListMaterial.lunar_Material);
        solar_shovel = new ShovelToolsBase("solar_shovel",ToolListMaterial.solar_Material);
        dark_shovel = new ShovelToolsBase("dark_shovel",ToolListMaterial.dark_Material);

        paradoxal_sword = new SwordToolsBase("paradoxal_sword",ToolListMaterial.paradoxal_material_sword);
        lunar_sword = new SwordToolsBase("lunar_sword",ToolListMaterial.lunar_material_sword);
        solar_sword = new SwordToolsBase("solar_sword",ToolListMaterial.solar_material_sword);
        dark_sword = new SwordToolsBase("dark_sword",ToolListMaterial.dark_material_sword);

        items = new Item[]{
                paradoxal_pickaxe,lunar_pickaxe,solar_pickaxe,dark_pickaxe,paradoxal_axe,lunar_axe,solar_axe,dark_axe,
                paradoxal_shovel,lunar_shovel,solar_shovel,dark_shovel,paradoxal_sword,lunar_sword,solar_sword,dark_sword
        };
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registermodels(ModelRegistryEvent e) {
        for (Item item : items)
        {
            registryModel(item);
        }
    }

    private static void registryModel(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID,item.getUnlocalizedName().substring(5)), "inventory"));
    }

    public static Item[] getItems() {
        return items;
    }
}
