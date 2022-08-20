package beta_Test;

import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import net.sourceforge.tess4j.*;
public class capcha_automation 
{
	@Test
	public void captchatest() throws InterruptedException, IOException, TesseractException
	{
//		System.setProperty("webdriver.chrome.driver", "G:\\gm_automation\\GoodmeetingsAutomation\\jars\\ChromeDriver\\ChromeDriver94\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("incognito");
//		DesiredCapabilities cap = DesiredCapabilities.chrome();
//		cap.setCapability(ChromeOptions.CAPABILITY, options);
//		WebDriver driver = new ChromeDriver(cap);
//		driver.manage().window().maximize();
//		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		String captcha_image = driver.findElement(By.id("captcha")).getAttribute("src");
//		System.out.println("captcha_image : "+captcha_image);
		
//		 URL imageURL = new URL(captcha_image);
//	     BufferedImage saveImage = ImageIO.read(imageURL);	     
//	     ImageIO.write(saveImage, "png", new File("captcha.png"));
//		
////		File img_src = driver.findElement(By.id("captcha")).getScreenshotAs(OutputType.FILE);
////		FileUtils.copyFile(img_src, new File("‪C:\\Users\\Lenovo\\Desktop" + "captcha_img.png"));
//	     //driver.quit();
//	     
//	     File imageFile = new File("G:\\gm_automation\\GoodmeetingsAutomation\\captcha.png");
//	     ITesseract instance = new Tesseract();
//	     instance.setDatapath("G:\\gm_automation\\GoodmeetingsAutomation\\traindata\\eng.traineddata");
//   		 instance.setLanguage("eng");
//   		 System.out.println("imageFile "+imageFile);
//		 String result = instance.doOCR(imageFile);
//		System.out.println(result);
	}
	
	@Test
	public void readimage()
	{
		String file_path = "G:\\gm_automation\\GoodmeetingsAutomation\\tessdata\\unnamed.png";//define the path of the image
		File img_file = new File(file_path);
		ITesseract instance  = new Tesseract();
		try {
			instance.setDatapath("G:\\gm_automation\\GoodmeetingsAutomation\\tessdata");
			String str = instance.doOCR(img_file);
			System.out.println("str : "+str);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
