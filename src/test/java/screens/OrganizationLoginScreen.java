package screens;

import elements.OrganizationLoginElements;
import org.openqa.selenium.WebDriver;
import static constants.UIConstants.LOGINWITHORGANIZATIONHEADERTEXT;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrganizationLoginScreen extends OrganizationLoginElements {

	//methods
	public OrganizationLoginScreen(WebDriver driver) {
		super(driver);
	}
	public void checkScreenAfterClikcLoginWithOrganization(){
		assertEquals("Organization header is not correct" , ORGANIZATIONPAGEHEADER.getText(), LOGINWITHORGANIZATIONHEADERTEXT);
		assertTrue("Login with email and password button is not visible on organization page" , isElementDisplay(LOGINWITHEMAILANDPASSWORD));
		assertTrue("Go back button is not visible on organization page" , isElementDisplay(GOBACKBUTTON));
	}
}
