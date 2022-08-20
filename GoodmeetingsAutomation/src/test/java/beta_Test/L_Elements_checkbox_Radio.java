package beta_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.gm.qa.base.TestBase;

public class L_Elements_checkbox_Radio extends TestBase
{
	
	@BeforeMethod
	public void Setup()
	{
		initialization();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	@Test
	public void test_checkbox() throws InterruptedException
	{
//		driver.findElement(By.xpath("//button[@title='Expand all']")).click();
//		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		
		//Validate Checkbox isSelected method and click
		
		WebElement check_element = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		boolean isSelected = check_element.isSelected();
		if(isSelected == false)
		{
			System.out.println("i am in if !!!!!!!!!!!!!!!!!!!s");
			check_element.click();
		}
		else
		{
			System.out.println("i am in else s");
		}
		Thread.sleep(3000);
		//Validate Checkbox isEnabled method and click
		WebElement checkbox_elemet_2 = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		boolean isEnabled = checkbox_elemet_2.isEnabled();
		if(isEnabled == true)
		{
			System.out.println("check box is enabled");
			checkbox_elemet_2.click();
		}
		else
		{
			System.out.println("i am in else ~~~~~~~~~~~~~~~~~~");
		}
		Thread.sleep(3000);
		//Validate Checkbox isDisplayed method and click
		WebElement checkbox_ele_3 = driver.findElement(By.xpath("//label[contains(text(),'Music')]"));
		boolean isDisplayed = checkbox_ele_3.isDisplayed();
		if(isDisplayed==true)
		{
			System.out.println("displayed");
			checkbox_ele_3.click();
		}
		else
		{
			
		}
		Thread.sleep(3000);
		//Validate Radio button isEnabled method and click
		WebElement radio_ele2 = driver.findElement(By.xpath("//label[contains(text(),'Other')]"));
		boolean radio_enabled = radio_ele2.isEnabled();
		if(radio_enabled == true)
		{
			System.out.println("button is already selected");
		}
		Thread.sleep(3000);
		//Validate Radio button isSelected method and click
		WebElement radio_ele = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		boolean isSelected_radio = radio_ele.isSelected();
		if(isSelected_radio == false)
		{
			radio_ele.click();
		}
		Thread.sleep(3000);
		//Validate Radio button isDisplayed method and click
		WebElement radio_ele3 = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		boolean radio_mak_displayed = radio_ele3.isDisplayed();
		if(radio_mak_displayed == true)
		{
			radio_ele.click();
		}
		
	
	}
}
