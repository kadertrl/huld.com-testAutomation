package screens;

import elements.HomeScreenElements;
import org.openqa.selenium.WebDriver;

import static constants.UIConstants.VALIDEMAIL;
import static org.junit.Assert.assertTrue;

public class HomeScreen extends HomeScreenElements {

	//methods
	public HomeScreen(WebDriver driver) {
		super(driver);
	}

	public HomeScreen checkHomePageAfterSuccessfullLogin(){
		waitForElement(HOMEBUTTON);
		assertTrue("Home button is not visible" , isElementDisplay(HOMEBUTTON));
		assertTrue("Global user item is not visible" , isElementDisplay(GLOBALUSERITEM));
		mouseHover(GLOBALUSERITEM);
		waitForElement(ENTEREDUSEREMAIL);
		assertTrue("Logged email is different than entered email." , ENTEREDUSEREMAIL.getText().contains(VALIDEMAIL));
 		return this;
	}

	public LandingScreen clickLogOutButton() {
		mouseHover(GLOBALUSERITEM);
		waitForElement(LOGOUTBUTTON);
		elementClick(LOGOUTBUTTON);
		return new LandingScreen(driver);
	}

	public HomeScreen isHomeScreen() {
		assertTrue("Home button is not visible" , isElementDisplay(HOMEBUTTON));
		return this;
	}

	public HomeScreen refreshHomeScreen() {
		refreshBrowser();
 		return this;
	}
}
