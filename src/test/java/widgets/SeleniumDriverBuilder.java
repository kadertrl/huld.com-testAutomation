package widgets;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;

import static constants.DriverConstants.*;

public abstract class SeleniumDriverBuilder {

    protected WebDriver driver;
    
    public static LocalDriverBuilder forLocal() {
        return new LocalDriverBuilder();
    }

	public static class LocalDriverBuilder extends SeleniumDriverBuilder {

		public WebDriver build() throws Exception {

			String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
			String browserName = System.getProperty("browser", "chrome").toLowerCase();
			String chromeDriverPath, firefoxDriverPath ;

			if ((OS.contains("mac")) || (OS.contains("darwin"))) {
				chromeDriverPath = MacChromeDriverPath;
				firefoxDriverPath = MacFirefoxDriverPath;
			}else if (OS.contains("win")) {
				chromeDriverPath = WinChromeDriverPath;
				firefoxDriverPath = WinFirefoxDriverPath;
			}else
				throw new Exception("Unsupported OS type: " + OS);

			switch (browserName) {
				case Chrome:
					System.setProperty(WebDriverChrome, chromeDriverPath);
					return driver = new ChromeDriver();
				case Firefox:
				    System.setProperty(WebDriverGecko, firefoxDriverPath);
					return driver = new FirefoxDriver();
				default:
					throw new IllegalStateException("Unexpected value: " + browserName);
			}
		}
	}
	public abstract WebDriver build() throws Exception;
}
