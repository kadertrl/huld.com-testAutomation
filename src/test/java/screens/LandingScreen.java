package screens;
import static org.junit.Assert.*;
import elements.LaindingScreenElements;
 import org.openqa.selenium.WebDriver;

public class LandingScreen extends LaindingScreenElements {

	//methods
	public LandingScreen(WebDriver driver) {
		super(driver);
	}

	public LandingScreen isLandingScreen(){
		assertTrue("Hudl Logo on the Landing page is not visible" , isElementDisplay(SITELOGO));
 		return this;
	}

	public LandingScreen clickOnLogInButton(){
		assertTrue("Login button is not visible on landing page" , isElementDisplay(LOGINSELECT));
		elementClick(LOGINSELECT);
		return this;
	}

	public LandingScreen checkAllLoginOptionsOnLandingScreen(){
		assertTrue("Login Hudl button is not visible" , isElementDisplay(LOGINHUDL));
		assertTrue("Login Wyscout button is not visible" , isElementDisplay(LOGINWYSCOUT));
		assertTrue("Login Volley Metrics button is not visible" , isElementDisplay(LOGIVOLLEYMETRICS));
		assertTrue("Login Mimu button is not visible" , isElementDisplay(LOGINWIMU));
		return this;
	}

	public LoginScreen clickOnHudlLogIn(){
		assertTrue("Login Hudl button is not visible" , isElementDisplay(LOGINHUDL));
		elementClick(LOGINHUDL);
		return new LoginScreen(driver);
	}
}
