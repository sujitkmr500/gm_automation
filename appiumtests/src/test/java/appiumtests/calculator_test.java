package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class calculator_test {
	static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		System.out.println("Program called . . . .");
		// TODO Auto-generated method stub
		try {
			open_calculator();
		} catch (Exception e) {
			e.getCause();
			e.getMessage();
			e.getStackTrace();
		}

	}
	public static void open_calculator() throws MalformedURLException
	{
		System.out.println("calling open calculator function");
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability("deviceName", "realme 8i");//device name : you will get it at About phone >> device name
		dcap.setCapability("udid", "SCTKWGMNEIZ9XGZX ");//device id : adb devices
		dcap.setCapability("platformName", "Android");//Mobile OS
		dcap.setCapability("platformVersion", "11");//Android Version
		dcap.setCapability("appPackage", "com.coloros.calculator");
		dcap.setCapability("appActivity", "com.coloros.calculator.calculator");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url, dcap);
		
		System.out.println("Application started . . . . .");
	}
}
