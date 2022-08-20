package beta_Test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import ai.gm.qa.base.TestBase;


public class L_Elements_Test extends TestBase
{
	
	@BeforeMethod
	public void Setup()
	{
		initialization();
		driver.navigate().to("https://demoqa.com/text-box");
	}
	
	@Test
	public void TextBox_test()
	{
	//driver.navigate().to("https://demoqa.com/text-box");
	HashMap<String, String> hm = new HashMap<String, String>();
	hm.put("Full Name", "SUJIT KUMAR");
	hm.put("c", "sujitkmr500@gmail.com");
	System.out.println("Given Key value : s"+hm.get("Full Name"));
//	for(Map.Entry<String, String> m : hm.entrySet())
//	{
//		System.out.println("Key is "+m.getKey()+" and value is : "+m.getValue());
//	}
	String fn = driver.findElement(By.xpath("//*[contains (text(), ‘Full Name’ )]")).getText();
	System.out.println("fn : "+fn);
	if(driver.findElement(By.id("userName")).equals(1))
	{
		driver.findElement(By.id("userName")).sendKeys(hm.get("Full Name"));
	}
	else
	{
		System.out.println("fullname not found : ");
	}
	if(driver.findElement(By.xpath("//input[@id='userEmail']")).equals(1))
	{
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(hm.get("Email"));
	}
	}
	
	
	
}
