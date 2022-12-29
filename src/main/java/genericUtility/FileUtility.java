package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author CE121
 *
 */
public class FileUtility {
		/**
		 * @throws Throwable 
		 * Its used to read the data from commonData.properties file based on key Which you pass as an argument 
		 * 
		 */
	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./commonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
	}

}
