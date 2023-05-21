package screens;

import elements.SignUpScreenElements;
import org.openqa.selenium.WebDriver;

import static constants.UIConstants.signup;
import static org.junit.Assert.assertTrue;

public class SignUpScreen extends SignUpScreenElements {

	//methods
	public SignUpScreen(WebDriver driver) {
		super(driver);
	}

	public SignUpScreen checkSignUpScreen(){
		assertTrue("SignUp Screen is not visible" , getCurrentUrl().toLowerCase().contains(signup));
 		return this;
	}
}
