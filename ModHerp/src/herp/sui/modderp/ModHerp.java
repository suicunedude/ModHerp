/**
 * 
 */
package herp.sui.modderp;

import herp.sui.modderp.network.PacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * @author suicune_dude
 *
 */
@Mod (modid = "HERP", name = "Herp", version = "Whatever you want")
@NetworkMod(channels = { "herp" }, clientSideRequired = true, serverSideRequired = false,
		packetHandler = PacketHandler.class)
public class ModHerp {
	
	@Instance("HERP")
	public static ModHerp pie;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
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