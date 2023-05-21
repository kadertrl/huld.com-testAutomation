package tests;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import widgets.TestBase;
import static constants.UIConstants.VALIDEMAIL;
import static constants.UIConstants.VALIDPASSWORD;
import static widgets.ScreenMethods.createRandomString;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTests extends TestBase {

	/**
	 Given A user navigates to 'hudl.com'
	 And the Hudl.com landing screen is display
	 When A user clicks 'Log in' button
	 Then A user sees all login "<options>"
	 Examples:
	 |  options             |
	 |  LOGINHUDL           |
	 |  LOGINWYSCOUT        |
	 |  LOGIVOLLEYMETRICS   |
	 |  LOGINWIMU           |
	 */
	@Test
	public void testLoginButtonsOnLandingScreen() {
		app.landingScreen()
				.isLandingScreen()
				.clickOnLogInButton()
				.checkAllLoginOptionsOnLandingScreen();
	}

	/**
	 Given A user navigates to hudl.com'
	 And the Hudl.com landing screen is display
	 When A user navigate Hudl login screen
	 Then A user sees login "<fields>"
	 Examples:
	 |  fields               |
	 |  EMAIL INPUT          |
	 |  PASSWORD INPUT       |
	 |  LOGIN BUTTON         |
	 |  REMEMBER ME CHECKBOX |
	 |  NEED HELP LINK       |
	 |  SIGN UP BUTTON       |
	 */
	@Test
	public void testcheckHudlLoginFields() {
		app.landingScreen()
				.isLandingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.checkLoginFieldsIsVisible();
	}


	/**
	 Given A user navigates to login screen
	 And the Hudl.com login screen is display
	 When A user clicks 'Log In' button
	 Then A user sees Error message on login screen
	 */
	@Test
	public void testUnsuccessfulLogInWithBlankFields() {
		app.landingScreen()
				.isLandingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.clickLoginButton()
				.checkErrorMessageWithBlankOrInvalidCredentials();
	}

	/**
	 Given A user navigates to login screen
	 When A user enters an invalid email <email> and password <password>
	 And A user clicks 'Log In' button
	 Then A user should not be successfully logged into the site
	 And A user sees Error message on login screen
	 */
	@Test
	public void testUnsuccessfulLogInWithInvalidCredential() {
		app.landingScreen()
				.isLandingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.enterEmail(createRandomString() + "@gmail.com")
				.enterPassword(createRandomString())
				.clickLoginButton()
				.checkErrorMessageWithBlankOrInvalidCredentials();
	}

	/**
	 Given A user navigates to login screen
	 When A user enters an valid email and invalid password
	 And A user clicks 'Log In' button
	 Then A user should not be successfully logged into the site
	 And A user sees Error message on login screen
	 */
	@Test
	public void testUnsuccessfulLogInWithRegisteredEmailAndWrongPassword() {
		app.landingScreen()
				.isLandingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.enterEmail(VALIDEMAIL)
				.enterPassword(createRandomString())
				.clickLoginButton()
				.checkErrorMessageWithBlankOrInvalidCredentials();
	}

	/**
	 Given A user navigates to login screen
	 When A user enters an valid email and password
	 And A user clicks 'Log In' button
	 Then A user should be successfully logged into the huld.com
	 */
	@Test
	public void testSuccessfulLogInWithValidCredential() {
		app.landingScreen()
				.isLandingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.enterEmail(VALIDEMAIL)
				.enterPassword(VALIDPASSWORD)
				.clickLoginButton()
				.redirectToHomeScreen()
				.checkHomePageAfterSuccessfullLogin();
	}

	/**
	 Given A user navigates to login screen
	 And A user enters valid email and password
	 When A user clicks Remind me checkbox
	 And A user clicks 'Log In' button
	 And A user clicks 'Log Out' button after logged in
	 Then A user sees entered Email in Login screen to be remembered
	 */
	@Test
	public void testRemindMeCheckBoxIsWorkingAsExpected() {
		app.landingScreen()
				.isLandingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.enterEmail(VALIDEMAIL)
				.enterPassword(VALIDPASSWORD)
				.clickRememberMeButton()
				.clickLoginButton()
				.redirectToHomeScreen()
				.isHomeScreen()
				.refreshHomeScreen()
				.isHomeScreen();
	}

	/**
	 Given A user navigates to login screen
	 When A user observes Sign up button on login page
	 And A user clicks 'Sign up' button
	 Then A user navigates sign up screen
	 */
	@Test
	public void testSignUpButtonOnLoginPage() {
		app.landingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.clickSignUpButtonOnLoginScreen()
				.checkSignUpScreen();
	}

	/**
	 Given A user navigates to login screen
	 When A user observes Need help button on login page
	 And A user clicks 'Need help' button
	 Then A user observes Need help pop-up on login screen
	 */
	@Test
	public void testNeedHelpButtonOnLoginScreen() {
		app.landingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.clickNeedHelpButton()
				.checkNeedHelpDetails();
	}

	/**
	 Given A user navigates to login screen
	 When A user observes Login with an organization button on login page
	 And A user clicks 'Login with an organization' button
	 Then A user navigates Log into Hudl with your Organization screen
	 */
	@Test
	public void testLoginWithOrganizationButtonOnLoginScreen() {
		app.landingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.clickLoginWithOrganization()
				.checkScreenAfterClikcLoginWithOrganization();
	}


	/**
	 Given A user navigates to login screen
	 And A user enters valid email and password
	 When A user clicks 'Log In' button
	 And A user observes home screen
	 And A user clicks 'Log Out' button
	 Then A user should be redirect to landing screen again
	 */
	@Test
	public void testUserCanLogOutAfterSuccessfullyLogin() {
		app.landingScreen()
				.isLandingScreen()
				.clickOnLogInButton()
				.clickOnHudlLogIn()
				.isHudlLogInScreen()
				.enterEmail(VALIDEMAIL)
				.enterPassword(VALIDPASSWORD)
				.clickLoginButton()
				.redirectToHomeScreen()
				.isHomeScreen()
				.clickLogOutButton()
				.isLandingScreen();
	}
}