package fr.paradoxal.paradox_mods;

import fr.paradoxal.paradox_mods.event.RegistringEvent;
import fr.paradoxal.paradox_mods.init.ModItems;
import fr.paradoxal.paradox_mods.proxy.CommonProxy;
import fr.paradoxal.paradox_mods.util.Reference;
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

@Mod(modid=Reference.MODID,name=Reference.MODNAME,version=Reference.VERSION,acceptedMinecraftVersions=Reference.ACCPETED_VERSION_MINECRAFT)
public class Main {
	
	public static final CreativeTabs paradoxalTabs  = new CreativeTabs("paradoxaltabs") {
		
		@Override
		public ItemStack getTabIconItem() {
			// TODO Auto-generated method stub
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
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY,serverSide=Reference.SERVEUR_PROXY)
	public static CommonProxy proxy;
	
	public void initMods()
	{
		System.out.println(Reference.MODID+" OS CLIENT: "+System.getProperty("os.name"));
		System.out.println(Reference.MODID+" OS VERSION: "+System.getProperty("os.version"));
		System.out.println(Reference.MODID+" OS ARCH: "+System.getProperty("os.arch"));
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(Reference.MODID + ":preInit");
		proxy.preInit();
		MinecraftForge.EVENT_BUS.register(new RegistringEvent());

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println(Reference.MODID + ":init");
		proxy.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(Reference.MODID + ":postInit");
		proxy.postInit();
	}
}
