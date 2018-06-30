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
import net.minecraftforge.fml.common.event.*;
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
        logger.debug("Main - Main","Paradoxal The serveur  best serveur");
        initMods();
    }

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVEUR_PROXY)
    public static CommonProxy proxy;

    public void initMods() {
         logger.debug("Main - init Mods","OS: "+System.getProperty("os.name"));
         logger.debug("Main - init Mods","Version OS"+System.getProperty("os.version"));
         logger.debug("Main - init Mods","Arch OS: "+System.getProperty("os.arch"));
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger.debug("Main","PreInit");
        proxy.preInit();
        MinecraftForge.EVENT_BUS.register(new RegistringEvent());
        GameRegistry.registerWorldGenerator(new GenerateOre(),0);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.debug("Main","Init");
        proxy.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.debug("Main","postInit");
        proxy.postInit();
    }

    @EventHandler
    public void serverstart(FMLServerStartedEvent event){
        logger.debug("Main","Start Serveur");
    }

    @EventHandler
    public void severstop(FMLServerStoppingEvent event){
        logger.debug("Main","Stop Serveur");
    }


}
