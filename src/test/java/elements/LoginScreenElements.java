package elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement ;
import org.openqa.selenium.support.FindBy;

import widgets.ScreenMethods;


public class LoginScreenElements extends ScreenMethods {

	public LoginScreenElements(WebDriver driver) {
		super(driver);
	}

	@FindBy(css= "[data-qa-id='email-input']")
	protected WebElement  EMAILINPUT;

	@FindBy(css="*[data-qa-id='password-input']")
	protected WebElement  PASSWORDINPUT;

	@FindBy(css="[data-qa-id='login-btn']")
	protected WebElement  LOGINBTN;

	@FindBy(css="[data-qa-id='remember-me-checkbox-label']")
	protected WebElement  REMEMBERME;

	@FindBy(css="[data-qa-id='need-help-link']")
	protected WebElement  NEEDHELPLINK;

	@FindBy(css="[data-qa-id='log-in-with-organization-btn']")
	protected WebElement  LOGINWITHORGANIZATION;

	@FindBy(linkText="Sign up")
	protected WebElement  SIGNUPONLOGINSCREEN;

	@FindBy(css="[data-qa-id='error-display']")
	protected WebElement  LOGINERRORMSG;

	@FindBy(css="[data-qa-id='login-help-headline']")
	protected WebElement  LOGINHELPHEADLINE;

	@FindBy(css="[data-qa-id='email-help-headline']")
	protected WebElement  EMAILHELPHEADLINE;

	@FindBy(css="[data-qa-id='forgot-email-copy']")
	protected WebElement  FORGOTMEMAILDETAILS;

	@FindBy(css="[data-qa-id='password-reset-submit-btn']")
	protected WebElement  PASSWORDRESET;

}
