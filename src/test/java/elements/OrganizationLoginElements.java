package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import widgets.ScreenMethods;


public class OrganizationLoginElements extends ScreenMethods {

	public OrganizationLoginElements(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="[data-qa-id='log-in-with-email-and-password']")
	protected WebElement LOGINWITHEMAILANDPASSWORD;

	@FindBy(className="uni-headline")
	protected WebElement  ORGANIZATIONPAGEHEADER;

	@FindBy(css="[data-qa-id='go-back']")
	protected WebElement GOBACKBUTTON;
}