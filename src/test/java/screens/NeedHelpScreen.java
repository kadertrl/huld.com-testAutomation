package screens;
import elements.NeedHelpScreenElements;
import org.openqa.selenium.WebDriver;
import static constants.UIConstants.*;
import static org.junit.Assert.assertTrue;

public class NeedHelpScreen extends NeedHelpScreenElements {

	//methods
	public NeedHelpScreen(WebDriver driver) {
		super(driver);
	}

	public NeedHelpScreen checkNeedHelpDetails() {
		assertTrue("Need help details does not have login help details" , LOGINHELPHEADLINE.getText().toLowerCase().contains(LOGINHELPTEXT.toLowerCase()));
		assertTrue("Need help details does not have email help details" , EMAILHELPHEADLINE.getText().toLowerCase().contains(EMAILHELPTEXT.toLowerCase()));

		assertTrue("Need help does not have forgot email details" ,isElementDisplay(FORGOTMEMAILDETAILS));
		assertTrue("Need help does not have password reset button" ,isElementDisplay(PASSWORDRESET));
		assertTrue("Go back button is not visible on need help page" , isElementDisplay(GOBACKBUTTON));
		return this;
	}
}
