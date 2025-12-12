package configsReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	public static Properties properties;
//	String path = "C:\\Users\\dsouz\\eclipse-workspace\\CucumberFramework5\\src\\main\\resources\\configs.properties";
    // Load properties file once
    public static void readProperties(String path) {
    	properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\dsouz\\eclipse-workspace\\CucumberFramework5\\src\\main\\resources\\configs.properties");
           
            properties.load(fis);
//            fis.close();
           
        } 
        catch(Exception e)
        {
        	e.printStackTrace();
        }
     
		
    }

    // Read a value by key
    public static String getProperty(String key) {
//        if (properties == null) {
//            throw new RuntimeException("Properties not loaded. Call loadProperties() first.");
//        }
        return properties.getProperty(key);
    }
	


}
