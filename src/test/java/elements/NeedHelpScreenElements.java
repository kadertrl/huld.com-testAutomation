package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import widgets.ScreenMethods;


public class NeedHelpScreenElements extends ScreenMethods {

	public NeedHelpScreenElements(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="[data-qa-id='login-help-headline']")
	protected WebElement  LOGINHELPHEADLINE;

	@FindBy(css="[data-qa-id='email-help-headline']")
	protected WebElement  EMAILHELPHEADLINE;

	@FindBy(css="[data-qa-id='forgot-email-copy']")
	protected WebElement  FORGOTMEMAILDETAILS;

	@FindBy(css="[data-qa-id='password-reset-submit-btn']")
	protected WebElement  PASSWORDRESET;

	@FindBy(css="[data-qa-id='go-back']")
	protected WebElement GOBACKBUTTON;

}
