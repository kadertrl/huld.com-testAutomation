package screens;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import elements.LoginScreenElements;
import static constants.UIConstants.*;
import static org.junit.Assert.assertTrue;

public class LoginScreen extends LoginScreenElements {

	//methods
	public LoginScreen(WebDriver driver) {
		super(driver);
	}

	public void checkLoginFieldsIsVisible(){
		assertTrue("Login email input is not visible" , isElementDisplay(EMAILINPUT));
		assertTrue("Login password input  is not visible" , isElementDisplay(PASSWORDINPUT));
		assertTrue("Login button is not visible on login page" , isElementDisplay(LOGINBTN));
		assertTrue("Remember me is not visible" , isElementDisplay(REMEMBERME));
		assertTrue("Need help link is not visible" , isElementDisplay(NEEDHELPLINK));
		assertTrue("Singup button is not visible on login page" , isElementDisplay(SIGNUPONLOGINSCREEN));
	}

	public LoginScreen isHudlLogInScreen(){
		assertTrue("Hudl login page is not visible" , getCurrentUrl().contains(HUDLLOGINURL));
		return this;
	}

	public LoginScreen enterEmail(String email) {
		elementSendKeys(EMAILINPUT,email).sendKeys(Keys.TAB);
  		return this;
	}

	public LoginScreen enterPassword(String password) {
		elementSendKeys(PASSWORDINPUT,password).sendKeys(Keys.TAB);
		return this;
	}

	public LoginScreen clickLoginButton() {
		LOGINBTN.click();
		return this;
	}

	public HomeScreen redirectToHomeScreen() {
		return new HomeScreen(driver);
	}
	public LoginScreen clickRememberMeButton() {
		assertTrue("Remember me is not visible" , isElementDisplay(REMEMBERME));
		REMEMBERME.click();
		return this;
	}
	public NeedHelpScreen clickNeedHelpButton() {
		assertTrue("Need help link is not visible" , isElementDisplay(NEEDHELPLINK));
		NEEDHELPLINK.click();
		return new NeedHelpScreen(driver);
	}

	public SignUpScreen clickSignUpButtonOnLoginScreen() {
		assertTrue("Singup button is not visible on login page" , isElementDisplay(SIGNUPONLOGINSCREEN));
		SIGNUPONLOGINSCREEN.click();
		return new SignUpScreen(driver);
	}

	public OrganizationLoginScreen clickLoginWithOrganization() {
		assertTrue("Login with an organization button is not visible on login page" , isElementDisplay(LOGINWITHORGANIZATION));
		LOGINWITHORGANIZATION.click();
		return new OrganizationLoginScreen(driver);
	}

	public void checkErrorMessageWithBlankOrInvalidCredentials(){
		assertTrue("Login page is not visible after click on log in button with blank/invalid Credentials" , getCurrentUrl().contains(HUDLLOGINURL));
		assertTrue("Error message does not show with blank/invalid credentials" , isElementDisplay(LOGINERRORMSG));
		assertTrue("Error message is wrong with blank/invalid credentials" , LOGINERRORMSG.getText().toLowerCase().contains(BLANKORINVALIDCREDENTIALERROR.toLowerCase()));
	}

	public LoginScreen checkNeedHelpPopup() {
		assertTrue("Need help popup does not have login help details" , LOGINHELPHEADLINE.getText().toLowerCase().contains(LOGINHELPTEXT.toLowerCase()));
		assertTrue("Need help popup does not have email help details" , EMAILHELPHEADLINE.getText().toLowerCase().contains(EMAILHELPTEXT.toLowerCase()));
		return this;
	}
}
