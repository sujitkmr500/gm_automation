package ai.gm.qa.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ai.gm.qa.base.TestBase;
import ai.gm.qa.pages.GMCreateMeetingPage;
import ai.gm.qa.pages.GMLoginPage;
import ai.gm.qa.utils.GMUtils;

public class GMLoginPageTest extends TestBase{
	GMLoginPage gmloginpage;
	GMUtils gmutils;
	GMCreateMeetingPage gmcreatemeeting;
	
	String sheetName = "credentials";
	
	
	public GMLoginPageTest()
	{
		super();
	}
	
	//Logger log = Logger.getLogger(GMLoginPage.class);
	
	@BeforeMethod
	public void Setup()
	{
		initialization();
		gmloginpage = new GMLoginPage();
		//log.info("---> Setup iniliazed for GMLoginPageTest class : started test execution");
	}
	
	@Test(priority = 1)
	public void LoginPageTitleTest()
	{
		String title  = gmloginpage.validateLoginPageTitle();
		//log.info("---> LoginPageTitleTest is in progress ");
		Assert.assertEquals(title, "Good Meetings");
		
	}
	@Test(priority = 2)
	public void goodmeetingslogoTest()
	{
		boolean flag = gmloginpage.validateGoodmeetingsLogo();
		//log.info("---> goodmeetingslogoTest has been completed");
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void loginTest()
	{
		//log.info("---> loginTest is in progress");
		gmcreatemeeting = gmloginpage.login(prop.getProperty("emailid"), prop.getProperty("password"));
		//log.warn("---> just a warning message : reading data from properties file, use data provider");
	}
	
	@DataProvider
	public Object[][] getCrdentialTestData() throws IOException
	{
		@SuppressWarnings("static-access")
		Object data[][] =  gmutils.getTestData(sheetName);
		return data;
	}
	
	// using data provider data fetching from excel, no of coloumn should be same as below var other wise u will get missmatch error - mandate
	@Test(priority = 4, dataProvider = "getCrdentialTestData")
	public void validatedifferentcomapnycredential(String useremail, String userpassword)
	{
		//log.info("---> reading data from excel by dataprovider");
		//gmloginpage.loginfordifferentcompany("sujit@goodmeetings.ai", "sujit@123");
		gmloginpage.loginfordifferentcompany(useremail, userpassword);
	}
	
	@Test
	public void Test_retry()
	{
		Assert.assertEquals(false, true);
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		//log.info("---> Browser is closed");
	}
	
	
	
	
	
	

}
