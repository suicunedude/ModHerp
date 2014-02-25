package herp.sui.modderp.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class ConfigHandler {
	
	public static void init(File file) {
		Configuration config = new Configuration(file);
		
		config.load();
		
		int test = config.get("useless stuff", "herp", 5).getInt();
		String test2 = config.get("ueseless stuff", "Some text", "WHAT DO YOU WANT FROM ME!?").getString();
		
		config.save();
		
		System.out.println(test2 + ": " + test);
	}

}
