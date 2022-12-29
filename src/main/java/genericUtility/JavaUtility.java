package genericUtility;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author CE121
 *
 */
public class JavaUtility {
	/**
	 * Its used to generate random number
	 */
	public int getRanDomNumber()
	{
		Random random = new Random();
		int intRandom = random.nextInt(10000);
		return intRandom;
	}
	
	
	/**
	 * used to get system date & time in IST format
	 */
	public String getSystemDateAndTime()
	{
		Date date = new Date();
		return date.toString();
	}
	
	
	/**
	 * used to get System date in YYYY-MM-DD format
	 */
	public String getSystemDateWithFormate()
	{
		Date date = new Date();
		String dateAndTime = date.toString();
		
		String YYYY = dateAndTime.split(" ")[5];
		String DD = dateAndTime.split(" ")[2];
		int MM = date.getMonth()+1;
		
		String finalFormate=YYYY+"-"+MM+"-"+DD;
		return finalFormate;
	}

}
