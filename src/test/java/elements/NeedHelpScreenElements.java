package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import widgets.ScreenMethods;


public class NeedHelpScreenElements extends ScreenMethods {

	public NeedHelpScreenElements(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@data-qa-id='login-help-headline']")
	protected WebElement  LOGINHELPHEADLINE;

	@FindBy(xpath="//input[@data-qa-id='password-reset-input']")
	protected WebElement  PASSWORDRESETINPUT;

	@FindBy(xpath="//*[@data-qa-id='email-help-headline']")
	protected WebElement  EMAILHELPHEADLINE;

	@FindBy(partialLinkText="support@hudl.com")
	protected WebElement  SUPPORTLINK;

	@FindBy(partialLinkText="Back")
	protected WebElement GOBACKBUTTON;

	@FindBy(xpath="//*[@data-qa-id='still-trouble-copy']")
	protected WebElement SUPPORTFIELD;

}
