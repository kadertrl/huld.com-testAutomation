package basefiles;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


public abstract class TestBase {

	protected HuldCom app;
	protected WebDriver driver;
	public static String baseUrl;


    @Before
    public void setUp() {

		baseUrl = "https://www.hudl.com/en_gb/";

		try {
			this.driver = SeleniumDriverBuilder.forLocal().build();
		} catch (Exception e) {
			e.printStackTrace();
		}
		app = new HuldCom(this.driver);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

    @After
    public void tearDown() {
        driver.quit();
    }
}