package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import basefiles.ScreenMethods;


public class HomeScreenElements extends ScreenMethods {

	public HomeScreenElements(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@data-qa-id='webnav-globalnav-home']")
	protected WebElement  HOMEBUTTON;

	@FindBy(className="hui-globaluseritem")
	protected WebElement  GLOBALUSERITEM;

	@FindBy(className="hui-globaluseritem__email")
	protected WebElement  ENTEREDUSEREMAIL;

	@FindBy(xpath="//*[@data-qa-id='webnav-usermenu-logout']")
	protected WebElement  LOGOUTBUTTON;
}
