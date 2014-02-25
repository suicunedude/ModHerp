package herp.sui.modderp.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class Items {
	
	public static Item wand;
	
	public static void init() {
		wand = new ItemWand(ItemInfo.WAND_ID);
		
		
	}
	
	public static void addNames()
	{
		LanguageRegistry.addName(wand, ItemInfo.WAND_NAME);
	}

}
