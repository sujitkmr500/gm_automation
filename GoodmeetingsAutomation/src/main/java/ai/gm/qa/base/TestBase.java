package ai.gm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import ai.gm.qa.utils.GMUtils;
import ai.gm.qa.utils.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fip = new FileInputStream(
					"G:\\gm_automation\\GoodmeetingsAutomation\\src\\main\\java\\ai\\gm\\qa\\config\\config.properties");
			prop.load(fip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"G:\\gm_automation\\GoodmeetingsAutomation\\jars\\ChromeDriver\\ChromeDriver94\\chromedriver.exe");
			//incognito browser launch
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("incognito");
			
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"G:\\gm_automation\\GoodmeetingsAutomation\\jars\\GeckoDriver\\geckodriver-v0.29.1\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(GMUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(GMUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);

		//driver.get(prop.getProperty("gmurl"));
		//driver.get(prop.getProperty("test_selenium_practice_form"));
	}

}
