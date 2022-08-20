package ai.gm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.gm.qa.base.TestBase;

public class GMLoginPage extends TestBase {

	
	//Page factory - OR
	
	@FindBy(id = "email")
	@CacheLookup //create a Cachememory, to increase the performance. do not use for those elements which will keeps on update in regular intervall (will get stailed exception)
	WebElement gmuseremail;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement gmpassword;
	
	@FindBy(xpath ="//*[@id=\"submitbtn\"]")
	@CacheLookup
	WebElement LoginButton;
	
	@FindBy(xpath ="//button[@id='submitbtn' and @type ='button']")
	WebElement LoginBtn;
	
	@FindBy(xpath ="/html/body/div[3]/div[1]/a")
	WebElement gmlogo;
	
	
	//Page factory Initialization / initializing the page Objects, this - current class object
	public GMLoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action (different features)
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateGoodmeetingsLogo()
	{
		return gmlogo.isDisplayed();
	}
	
	public GMCreateMeetingPage login(String uid,String upwd)
	{
		gmuseremail.sendKeys(uid);
		gmpassword.sendKeys(upwd);
		LoginButton.click();
		
		return new GMCreateMeetingPage();
	}
	
	public void loginfordifferentcompany(String useremail,String userpassword)
	{
		gmuseremail.sendKeys(useremail);
		gmpassword.sendKeys(userpassword);
		LoginBtn.click();
	}
	
}
