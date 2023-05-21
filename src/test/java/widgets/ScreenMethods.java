package widgets;

import java.awt.Toolkit;
import java.time.Duration;
import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.fail;


public class ScreenMethods {

	protected static WebDriver driver;

	public ScreenMethods(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}

	public WebElement elementSendKeys(WebElement id, String string) {
    	WebElement element = waitForElement(id);
		element.clear();
		element.sendKeys(string);
		return element;
	}
	
		public WebElement waitForElement(WebElement element ) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1L));
   		return wait.until(ExpectedConditions.elementToBeClickable(element));
   	}

	public WebElement elementClick(WebElement element) {
		waitForElement(element);
		element.click();
		return element;
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}


	public boolean isElementDisplay(WebElement element) {
		try {
			waitForElement(element);
			return element.isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public static String createRandomString() {
		return RandomStringUtils.randomAlphabetic(15);
	}

	public void mouseHover(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void refreshBrowser() {
		driver.navigate().refresh();
	}

	public void maximizeScreen(WebDriver driver) {
	    java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    Point position = new Point(0, 0);
	    driver.manage().window().setPosition(position);
	    Dimension maximizedScreenSize =
	        new Dimension((int) screenSize.getWidth(), (int) screenSize.getHeight());
	    driver.manage().window().setSize(maximizedScreenSize);
	}

	public static void assertListContains(List<Object> expected, Object actual) {
		if (!expected.contains(actual)) {
			fail("Expected: " + expected + " Actual: " + actual);
		}
	}
}
