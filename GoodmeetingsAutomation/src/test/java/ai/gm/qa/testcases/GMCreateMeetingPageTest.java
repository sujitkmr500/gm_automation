package ai.gm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ai.gm.qa.base.TestBase;
import ai.gm.qa.pages.GMCreateMeetingPage;
import ai.gm.qa.pages.GMLoginPage;
import ai.gm.qa.pages.GmHomePage;

public class GMCreateMeetingPageTest extends TestBase{
	GMCreateMeetingPage gmcreatemeeting;
	GMLoginPage gmloginpage;
	GmHomePage gmhomepage;
	
	public GMCreateMeetingPageTest()
	{
		super();
	}
	
	// test cases should be seperated -- independent with  each other
	// before each testcase -- launch browser and login
	//@test - execute test case
	// after each testcase -- close the browser
	@BeforeMethod
	public void Setup()
	{
		initialization();
		gmloginpage = new GMLoginPage();
		gmcreatemeeting = gmloginpage.login(prop.getProperty("emailid"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyCreateMeetingspageTitle()
	{
		String gmcreatemeetingpagetitle = gmcreatemeeting.verifyCreateMeetingsPageTitle().trim();
		//Assert.assertEquals(gmcreatemeetingpagetitle,"Good Meetings");
		Assert.assertEquals("~ Create meeting page title not matched !!!", gmcreatemeetingpagetitle, "Good Meetings");
	}
	
	@Test(priority = 2)
	public void verifyGMLogoTest()
	{
	  	boolean flag = gmcreatemeeting.validateGoodmeetingsLogo();
	  	Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void verifyLogoutLinkTest()
	{
		gmhomepage = gmcreatemeeting.clickonLogoutLink();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
}