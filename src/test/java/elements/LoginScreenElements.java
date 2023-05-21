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

	@FindBy(xpath="//*[@data-qa-id='login-btn']")
	protected WebElement  LOGINBTN;

	@FindBy(xpath="//*[@data-qa-id='remember-me-checkbox-label']")
	protected WebElement  REMEMBERME;

	@FindBy(xpath="//*[@data-qa-id='need-help-link']")
	protected WebElement  NEEDHELPLINK;

	@FindBy(xpath="//*[@data-qa-id='log-in-with-organization-btn']")
	protected WebElement  LOGINWITHORGANIZATION;

	@FindBy(linkText="Sign up")
	protected WebElement  SIGNUPONLOGINSCREEN;

	@FindBy(xpath="//*[@data-qa-id='error-display']")
	protected WebElement  LOGINERRORMSG;

	@FindBy(xpath="//*[@data-qa-id='login-help-headline']")
	protected WebElement  LOGINHELPHEADLINE;

	@FindBy(xpath="//*[@data-qa-id='email-help-headline']")
	protected WebElement  EMAILHELPHEADLINE;

}
