package genericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Its contains WebDriver specific reusable actions
 * 
 * @author CE121
 *
 */
public class WebDriverUtility {

	/**
	 * Wait for page to load before indentifying any sychronized element in DOM[HTML
	 * -Document]
	 */
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	/**
	 * Used to wait for element to be clickable in GUI, and check for specific
	 * element for every 500 milli seconds
	 * 
	 * @author CE121
	 */
	public void waitForPageToBeClickAble(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * Used to wait for element to be visible in GUI, and check for specific element
	 * for every 500 milli seconds
	 * 
	 * @author CE121
	 */
	public void waitForVisiblity(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * Maximaize the browser
	 */
	public void maximaizethebrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * User to switch to alert window and click on cancel button
	 */
	public void switchToAlertWindowAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		;
	}

	/**
	 * User to switch to alert window and click on OK button
	 */
	public void switchToAlertWindowAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * Used to switch to frame window based o index
	 * 
	 * @author CE121 driver
	 * @author CE121 index
	 */
	public void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * Used to switch to frame window based on id or name attribute
	 */
	public void switchToFrame(WebDriver driver, String id_name_attribute) {
		driver.switchTo().frame(id_name_attribute);
	}

	/**
	 * Used to switch to defaultContentframe
	 */
	public void switchToDefaultContentFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * used to select dropDown based on index
	 */
	public void getSelectByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	/**
	 * used to select dropDown based on Visible text
	 */
	public void getSelectByVisibleText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public String getAttribute(WebElement e, String attribute) {
		return e.getAttribute(attribute);
	}

	/**
	 * used to mouseover by actions class
	 */
	public void mouseOverElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void keystosend(WebDriver driver, String text) {
		Actions act = new Actions(driver);
		act.sendKeys(text).perform();
	}

	/**
	 * used to run java script by using javaScxriptExecuter
	 */
	public void executejavaScript(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
	}

	public void scrollDownByJavascript(WebDriver driver, String dimension) {
		// use 450 350...

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0," + dimension + ")");
	}

	public void scrollUpByJavascript(WebDriver driver, String dimension) {
		/// use -450 -350...

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-" + dimension + ")");

	}

	public void scrollDownToElementByJavascript(WebDriver driver, WebElement element) {

		/**
		 * Used to scroll down the webpage by the visibility of the element
		 */

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void scrollDownToButtomPageByJavascript(WebDriver driver) {

		/**
		 * Used to scroll down the webpage at the buttom of page
		 */

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void scrollUpToTopByJavascript(WebDriver driver) {

		/**
		 * Used to scrollUp the webpage at the top of page
		 */

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollTop)");
	}

	public void clickElement(WebElement element, WebDriver driver) {
		/**
		 * click the hidden element in webpage
		 */
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}

	/**
	 * used to scroll Down by using Robot class
	 * 
	 * @throws AWTException
	 */
	public void scrollPageDownByKey(WebDriver driver) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	/**
	 * used to scroll Up by using Robot class
	 * 
	 * @throws AWTException
	 */
	public void scrollPageUpByKey(WebDriver driver) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	/**
	 * used to scroll To the buttom of the page by using Robot class
	 * 
	 * @throws AWTException
	 */
	public void scrollPageToButtomByKey(WebDriver driver) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

	/**
	 * used to capture the Screen Sort
	 * 
	 * @throws Throwable
	 */

	JavaUtility jlib = new JavaUtility();

	public String takeScreenShot(WebDriver driver, String screenshotName) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenShot/" + screenshotName + jlib.getSystemDateWithFormate() + ".png");
		FileUtils.copyFile(src, dest);
		return dest.getAbsolutePath();
	}

}
