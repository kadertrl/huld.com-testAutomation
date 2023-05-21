package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import widgets.ScreenMethods;


public class LaindingScreenElements extends ScreenMethods {

	public LaindingScreenElements(WebDriver driver) {
		super(driver);
	}

    @FindBy(css= "[data-qa-id='site-logo']")
	protected WebElement  SITELOGO;

	@FindBy(css="*[data-qa-id='login-select']")
	protected WebElement  LOGINSELECT;

	@FindBy(css="[data-qa-id='login-hudl']")
	protected WebElement  LOGINHUDL;

	@FindBy(css="[data-qa-id='login-wyscout']")
	protected WebElement  LOGINWYSCOUT;

	@FindBy(css="[data-qa-id='login-volleymetrics']")
	protected WebElement  LOGIVOLLEYMETRICS;

	@FindBy(css="[data-qa-id='login-wimu']")
	protected WebElement  LOGINWIMU;
}
