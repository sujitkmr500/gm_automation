package ai.gm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.gm.qa.base.TestBase;

public class GMCreateMeetingPage extends TestBase{
	
	
	//Page factory - OR
	@FindBy(xpath = "/html/body/section[1]/div/div/div/div/text()")
	WebElement LoggedinasText;
	
	@FindBy(id = "username")
	WebElement loggedinusername;
	
	@FindBy(id = "signOut")
	WebElement logoutLink;
	
	@FindBy(xpath ="/html/body/section[2]/div/div/div[1]/a/img")
	WebElement gmlogo;
	
	@FindBy(xpath ="/html/body/section[2]/div/div/div[1]/a/img")
	WebElement gmboldtextdescription;
	
	@FindBy(xpath ="/html/body/section[2]/div/div/div[1]/a/img")
	WebElement gmtextdescription;
	
	@FindBy(xpath ="/html/body/section[2]/div/div/div[3]/img")
	WebElement gmcreatemeeting_page_image;
	
	@FindBy(xpath ="//button[contains(text(),'Join Room')]")
	WebElement joinroombutton;
	
	@FindBy(xpath ="//button[contains(text(),'View Recordings')]")
	WebElement viewrecordings;
	
	
	
	//Page factory Initialization / initializing the page Objects, this - current class object
	public GMCreateMeetingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action (different features)
	public String verifyCreateMeetingsPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLoggedinText()
	{
		return LoggedinasText.isDisplayed();
	}
	
	public boolean verifyCorrectUsername()
	{
		return loggedinusername.isDisplayed();
	}
	
	public boolean validateGoodmeetingsLogo()
	{
		return gmlogo.isDisplayed();
	}
	
	public boolean verifyCorrectDescriptionBold()
	{
		return gmboldtextdescription.isDisplayed();
	}
	
	public boolean verifyCorrectDescription()
	{
		return gmtextdescription.isDisplayed();
	}
	
	public GmHomePage clickonLogoutLink()
	{
		logoutLink.click();
		return new GmHomePage();
	}
	
	public boolean validateCreateMeetingPageImage()
	{
		return gmcreatemeeting_page_image.isDisplayed();
	}
	
	public GMJoinRoomPage joinRoomButton()
	{
		joinroombutton.click();
		return new GMJoinRoomPage();
	}
	
	public GMRecordingsPage viewRecordingsPageButton()
	{
		viewrecordings.click();
		return new GMRecordingsPage();
	}

	
	
	
	
	
	
	

}