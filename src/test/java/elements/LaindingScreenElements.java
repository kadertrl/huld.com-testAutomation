package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basefiles.ScreenMethods;


public class LaindingScreenElements extends ScreenMethods {

	public LaindingScreenElements(WebDriver driver) {
		super(driver);
	}

    @FindBy(xpath="//*[@data-qa-id='site-logo']")
	protected WebElement  SITELOGO;

	@FindBy(xpath="//*[@data-qa-id='login-select']")
	protected WebElement  LOGINSELECT;

	@FindBy(xpath="//*[@data-qa-id='login-hudl']")
	protected WebElement  LOGINHUDL;

	@FindBy(xpath="//*[@data-qa-id='login-wyscout']")
	protected WebElement  LOGINWYSCOUT;

	@FindBy(xpath="//*[@data-qa-id='login-volleymetrics']")
	protected WebElement  LOGIVOLLEYMETRICS;

	@FindBy(xpath="//*[@data-qa-id='login-wimu']")
	protected WebElement  LOGINWIMU;
}
