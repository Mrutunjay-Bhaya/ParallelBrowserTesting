package practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DropdownHandelWithoutSelectClass extends BaseClass {
	
	/*@Test()
	public void selectDropdown() {
		String url= "https://www.tutorialspoint.com/tutor_connect/index.php";
		 driver.get(url);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      // getting the list of elements with the xpath
	      List<WebElement> opt = driver.findElements(By.xpath("//select[@name='selType']//option"));
	      int s = opt.size();
	      // Iterating through the list selecting the desired option
	      for( int j = 0; j< opt.size();j++){
	         // if the option is By Subject click that option
	         if( opt.get(j).getText().equals("By Name")){
	            opt.get(j).click();
	            break;
	         }}
	         
	      }
	      
	      //driver.quit();
		
		
*/
		@Test
		public void makeMyTrip() throws InterruptedException {
			String url= "https://www.makemytrip.com/";
			driver.get(url);
			//driver.findElement(By.xpath("//input[@id='fromCity']")).click();
			//driver.findElement(By.xpath("//p[text()='Goa, India']")).click();
			Thread.sleep(3000);
//			driver.findElement(By.xpath("//input[@id='toCity']")).click();
//			driver.findElement(By.xpath("//p[text()='Chennai, India']")).click();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

