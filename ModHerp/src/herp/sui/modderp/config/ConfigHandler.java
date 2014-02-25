package herp.sui.modderp.config;

import herp.sui.modderp.items.ItemInfo;
import herp.sui.modderp.lib.ConfigValues;

import java.io.File;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class ConfigHandler {
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		Confs.HERPVAL = config.get(ConfigValues.CATEGORY_USELESS, ConfigValues.HERP_NAME, 
				ConfigValues.HERP_DEFAULT).getInt();
		Confs.SOMETEXTVAL = config.get(ConfigValues.CATEGORY_USELESS, ConfigValues.SOMETEXT_NAME,
				ConfigValues.SOMETEXT_DEFAULT).getString();
		
		ItemInfo.WAND_ID = config.getItem(ConfigValues.WAND_KEY, 
				ConfigValues.WAND_DEFAULT).getInt() - 256;
		
		config.save();
		
		
	}

}
