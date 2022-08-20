package beta_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.gm.qa.base.TestBase;

public class L_Actions extends TestBase{
	@BeforeMethod
	public void Setup()
	{
		initialization();
		driver.get("https://demoqa.com/buttons");
	}
	
	@Test
	public void sction_test()
	{
		Actions actions = new Actions(driver);
		WebElement webelement = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(webelement).perform();
	}
	@Test
	public void double_test()
	{
		Actions act = new Actions(driver);
		WebElement wb_element = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(wb_element).perform();
	}
}
