package widgets;

import org.openqa.selenium.WebDriver;

import screens.*;
public class HuldCom {
	private final WebDriver driver;

    public HuldCom(WebDriver driver) {
        this.driver = driver;
    }
    public LandingScreen landingScreen() { return new LandingScreen(driver); }
    public LoginScreen loginScreen() { return new LoginScreen(driver); }
    public HomeScreen homeScreen() { return new HomeScreen(driver); }
    public OrganizationLoginScreen organizationLoginScreen() { return new OrganizationLoginScreen(driver); }
    public SignUpScreen signUpScreen() { return new SignUpScreen(driver); }
}
