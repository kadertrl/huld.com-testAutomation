package screens;
import elements.NeedHelpScreenElements;
import org.openqa.selenium.WebDriver;
import static constants.UIConstants.*;
import static org.junit.Assert.assertTrue;

public class NeedHelpScreen extends NeedHelpScreenElements {

	public NeedHelpScreen(WebDriver driver) {
		super(driver);
	}

	public NeedHelpScreen checkNeedHelpDetails() {
		waitForElement(LOGINHELPHEADLINE);
		assertTrue("Need help details does not have login help details" , LOGINHELPHEADLINE.getText().toLowerCase().contains(LOGINHELPTEXT.toLowerCase()));
		assertTrue("Need help does not have password reset inout field" ,isElementDisplay(PASSWORDRESETINPUT));
		assertTrue("Need help details does not have email help details" , EMAILHELPHEADLINE.getText().toLowerCase().contains(EMAILHELPTEXT.toLowerCase()));

		scrollToElement(SUPPORTFIELD);
		assertTrue("Need help does not have support link fields" ,isElementDisplay(SUPPORTLINK));
		assertTrue("Go back button is not visible on need help page" , isElementDisplay(GOBACKBUTTON));

		return this;
	}
}
