package beta_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.gm.qa.base.TestBase;

public class L_drag_drop extends TestBase
{
	@BeforeMethod
	public void Setup()
	{
		initialization();
		driver.get("https://demoqa.com/droppable");
	}
	@Test
	public void drag_drop()
	{
		WebElement drag_element_from = driver.findElement(By.id("draggable"));
		WebElement drop_element_to = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag_element_from, drop_element_to).perform();
		//drag and drop by offset event needs to be checked
	}
}
