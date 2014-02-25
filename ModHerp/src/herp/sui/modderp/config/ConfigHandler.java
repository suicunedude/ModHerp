package herp.sui.modderp.config;

import herp.sui.modderp.lib.ConfigValues;

import java.io.File;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class ConfigHandler {
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		int test = config.get(ConfigValues.CATEGORY_USELESS, ConfigValues.HERP_NAME, 
				ConfigValues.HERP_DEFAULT).getInt();
		String test2 = config.get(ConfigValues.CATEGORY_USELESS, ConfigValues.SOMETEXT_NAME,
				ConfigValues.SOMETEXT_DEFAULT).getString();
		
		config.save();
		
		System.out.println(test2 + ": " + test);
	}

}
