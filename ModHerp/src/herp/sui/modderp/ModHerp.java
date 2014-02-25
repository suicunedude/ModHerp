/**
 * 
 */
package herp.sui.modderp;

import herp.sui.modderp.config.ConfigHandler;
import herp.sui.modderp.lib.Values;
import herp.sui.modderp.network.PacketHandler;
import herp.sui.modderp.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * @author suicune_dude
 *
 */
@Mod (modid = Values.MODID, name = Values.MODNAME, 
	version = Values.MODVERSION)
@NetworkMod(channels = { Values.MODCHANNEL }, clientSideRequired = true, 
	serverSideRequired = false, packetHandler = PacketHandler.class)
public class ModHerp {
	
	@Instance(Values.MODID)
	public static ModHerp pie;
	
	@SidedProxy(clientSide = "herp.sui.modderp.proxies.ClientProxy", 
			serverSide = "herp.sui.modderp.proxies.CommonProxy" )
	public static CommonProxy proxy;
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}

}
