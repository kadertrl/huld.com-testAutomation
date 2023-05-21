package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basefiles.ScreenMethods;


public class OrganizationLoginElements extends ScreenMethods {

	public OrganizationLoginElements(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@data-qa-id='log-in-with-email-and-password']")
	protected WebElement LOGINWITHEMAILANDPASSWORD;

	@FindBy(className="uni-headline")
	protected WebElement  ORGANIZATIONPAGEHEADER;

	@FindBy(xpath="//*[@data-qa-id='go-back']")
	protected WebElement GOBACKBUTTON;
}
