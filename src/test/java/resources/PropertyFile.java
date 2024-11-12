package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	

    static Properties prop;
    static FileInputStream input;
    public static String testData = "src\\test\\java\\resources\\Utility.Properties";
    
    public static String getproperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(testData);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}

