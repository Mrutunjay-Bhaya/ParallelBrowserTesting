package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DropdownHandelWithMouse extends BaseClass {
	@Test()
	public void actionClass() {
		String url= "https://www.tutorialspoint.com/tutor_connect/index.php";
		 driver.get(url);
//		 WebElement element =driver.findElement(By.xpath("//select[@name='selType']"));
//		element.click();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.keyDown(Keys.ALT);
//		act.sendKeys("By Name").perform();
//		act.click();
		}
	
}
