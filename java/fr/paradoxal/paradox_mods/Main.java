package fr.paradoxal.paradox_mods;

import fr.paradoxal.paradox_mods.dev.DevMain;
import fr.paradoxal.paradox_mods.event.RegistringEvent;
import fr.paradoxal.paradox_mods.init.ModItems;
import fr.paradoxal.paradox_mods.proxy.CommonProxy;
import fr.paradoxal.paradox_mods.util.Reference;
import fr.paradoxal.paradox_mods.world.GenerateOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.logging.Logger;


@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCPETED_VERSION_MINECRAFT)
public class Main {

    public static DevMain logger = new DevMain();

    public static final CreativeTabs paradoxalTabs = new CreativeTabs("paradoxaltabs") {

        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.logo);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    }.setBackgroundImageName("item_search.png");

    public Main() {
        initMods();
    }

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVEUR_PROXY)
    public static CommonProxy proxy;

    public void initMods() {
        logger.loggerinfo("Main - Init Mods","OS CLIENT "+System.getProperty("os.name"));
        logger.loggerinfo("Main - Init Mods","OS VERSION "+System.getProperty("os.version"));
        logger.loggerinfo("Main - Init Mods","OS ARCH "+System.getProperty("os.name"));
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger.loggerinfo("Pre Init","Phase de preinit");
        proxy.preInit();
        MinecraftForge.EVENT_BUS.register(new RegistringEvent());
        GameRegistry.registerWorldGenerator(new GenerateOre(),0);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.loggerinfo("Main - init","Phase de init");
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.loggerinfo("Main - postinit","Phase de posinit");
        proxy.postInit();
    }


}
