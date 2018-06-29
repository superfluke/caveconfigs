package fluke.caveconfigs;

import fluke.caveconfigs.proxy.CommonProxy;
import fluke.caveconfigs.util.Reference;
import fluke.caveconfigs.world.WorldTypeTest;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptableRemoteVersions="*")
public class Main 
{

	public static WorldTypeTest testWorld;
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLInitializationEvent event)
	{

	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		testWorld = new WorldTypeTest();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{

	}
	
	@EventHandler
	public void startServer(FMLServerStartingEvent event) 
	{

	}
	
}
