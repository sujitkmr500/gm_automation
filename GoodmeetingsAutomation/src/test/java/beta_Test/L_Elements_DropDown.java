package beta_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ai.gm.qa.base.TestBase;

public class L_Elements_DropDown extends TestBase
{	
	@BeforeMethod
	public void Setup()
	{
		initialization();
		driver.get("https://demoqa.com/select-menu");
	}
	
	@Test
	public void dropdown_test()
	{
		Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
		select.selectByValue("9");
		select.selectByIndex(1);
		driver.findElement(By.id("oldSelectMenu")).click();
		select.selectByVisibleText("Black");
		//Multi select : 
		Select selct_car = new Select(driver.findElement(By.id("cars")));
		if(selct_car.isMultiple()) // web element is multi-select or not
		{
			selct_car.selectByIndex(1);
			selct_car.selectByValue("saab");
			selct_car.selectByVisibleText("Volvo");
		}
		//get options
		Select select_opt = new Select(driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]")));
		// Get all the options of the dropdown
		List<WebElement> options = select_opt.getOptions();
		System.out.println("@@@@@@"+options.size());
	}
}
