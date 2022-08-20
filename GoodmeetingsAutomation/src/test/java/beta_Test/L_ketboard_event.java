package beta_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.gm.qa.base.TestBase;

public class L_ketboard_event extends TestBase
{
	@BeforeMethod
	public void Setup()
	{
		initialization();
		driver.get("https://demoqa.com/text-box");
	}
//	@Test
//	public void keyborad_control_test()
//	{
//		
//		driver.findElement(By.id("currentAddress")).sendKeys("vill : dakaita,dist godda, 814165");
//		WebElement currentaddress = driver.findElement(By.id("currentAddress"));
//		// Copy the Current Address
//		currentaddress.sendKeys(Keys.CONTROL);
//		currentaddress.sendKeys("A");
//		currentaddress.sendKeys(Keys.CONTROL);
//		currentaddress.sendKeys(null);
//		currentaddress.sendKeys("C");
//		//Press the TAB Key to Switch Focus to Permanent Address
//		currentaddress.sendKeys(Keys.TAB);
//		//Paste the Address in the Permanent Address field
//		WebElement permanentaddress = driver.findElement(By.id("permanentAddress"));
//		permanentaddress.sendKeys(Keys.CONTROL);
//		permanentaddress.sendKeys("V");		
//	}
	@Test
	public void keyactions_test()
	{
		driver.findElement(By.id("currentAddress")).sendKeys("vill : dakaita,dist godda, 814165");
		//WebElement currentaddress = driver.findElement(By.id("currentAddress"));
		//Select the text
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
		// Copy the Current Address using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
		//Press the TAB Key to Switch Focus to Permanent Address
		actions.sendKeys(Keys.TAB);
		actions.build().perform();
		//Paste the Address in the Permanent Address field using CTRL + V
		WebElement permanentaddress = driver.findElement(By.id("permanentAddress"));
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.build().perform();
		
	}

}
