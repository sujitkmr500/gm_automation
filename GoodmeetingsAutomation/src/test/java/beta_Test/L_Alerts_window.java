package beta_Test;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.gm.qa.base.TestBase;

public class L_Alerts_window extends TestBase
{
		@BeforeMethod
		public void Setup()
		{
			initialization();
			driver.get("https://demoqa.com/alerts");
		}
		@Test
		public void alertTest()
		{
			//Alert button check
			driver.findElement(By.id("alertButton")).click();
			Alert simplealert = driver.switchTo().alert();
			simplealert.accept();
			driver.quit();
		}
		@Test
		public void timeralert()
		{
			try
			{
				//Timer Alert
				driver.findElement(By.id("timerAlertButton")).click();
				System.out.println("~~~~~~~~~~~~alert clicked ");
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.alertIsPresent());
				Alert simplealert2 = driver.switchTo().alert();
				simplealert2.accept();
			}
			catch(Exception e)
			{
				
			}
		}
		@Test
		public void confirmation_alert() throws InterruptedException
		{
			WebElement ele = driver.findElement(By.id("confirmButton"));
			ele.click();
			Thread.sleep(2000);
			Alert simplealert3 = driver.switchTo().alert();
			simplealert3.dismiss();
			Thread.sleep(2000);
			ele.click();
			Thread.sleep(2000);
			simplealert3.accept();
			Thread.sleep(2000);
		}
		@Test
		public void promptalert() throws InterruptedException
		{
			driver.findElement(By.id("promtButton")).click();
			Alert promalert = driver.switchTo().alert();
			System.out.println(promalert.getText());
			promalert.sendKeys("sujit kumar");
			promalert.accept();	
		}
		
		//window handles in new tab
		@Test
		public void newtab_Test() throws InterruptedException
		{
			driver.get("https://demoqa.com/browser-windows");
			Thread.sleep(3000);
			driver.findElement(By.id("tabButton")).click();
			Thread.sleep(3000);
			String mainwindow = driver.getWindowHandle();
			// To handle all new opened window.
			Set<String> windoset = driver.getWindowHandles();
			Iterator<String> itr = windoset.iterator();
			while(itr.hasNext())
			{
				String child_window = itr.next();
				// Switching to Child window
				if(mainwindow.equalsIgnoreCase(child_window))
				{
					driver.switchTo().window(child_window);
					System.out.println("Title of the page : s"+driver.getTitle());
				}
			}
			driver.switchTo().window(mainwindow);
			driver.quit();
		}
		//popup window on same window
		@Test
		public void handle_popup_window() throws InterruptedException
		{
			driver.navigate().to("https://demoqa.com/browser-windows");
			Thread.sleep(3000);
			driver.findElement(By.id("windowButton")).click();
			String mainwindow = driver.getWindowHandle();
			Set<String> winset = driver.getWindowHandles();
			Iterator<String> itr = winset.iterator();
			while(itr.hasNext())
			{
				String childwindow = itr.next();
				if(mainwindow.equalsIgnoreCase(childwindow))
				{
					Thread.sleep(2000);
					driver.switchTo().window(childwindow);
					System.out.println("0000000000000000000000000000000");
					Thread.sleep(2000);
					driver.close();
					System.out.println("child window closed");
				}
			}
			Thread.sleep(2000);
			//switch back to main wiondow
			driver.switchTo().window(mainwindow);
			driver.quit();
		}
}
