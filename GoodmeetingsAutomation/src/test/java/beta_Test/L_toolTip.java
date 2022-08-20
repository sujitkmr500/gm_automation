package beta_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.gm.qa.base.TestBase;

public class L_toolTip extends TestBase
{
	@BeforeMethod
	public void Setup()
	{
		initialization();
		driver.get("https://demoqa.com/tool-tips");
	}
	
	@Test
	public void tooltiptest()
	{
		WebElement ttele = driver.findElement(By.id("toolTipButton"));
		Actions actions = new Actions(driver);
		actions.moveToElement(ttele).perform();
	}
}
