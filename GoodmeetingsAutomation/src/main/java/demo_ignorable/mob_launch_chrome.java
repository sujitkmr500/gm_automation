package demo_ignorable;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mob_launch_chrome {
	WebDriver driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	
	@BeforeTest
	public void init()
	{
		cap.setCapability("deviceName", "17f2359b");
		cap.setCapability("platformName", "Android");
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(CapabilityType.VERSION, "10");
	}
	@Test
	public void test_app() throws MalformedURLException
	{
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.get("https://goodmeetings.ai/");
	}
}
