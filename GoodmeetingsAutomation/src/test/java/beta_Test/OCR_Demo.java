package beta_Test;

import java.io.File;

import org.testng.annotations.Test;
import net.sourceforge.tess4j.*;

public class OCR_Demo 
{
	@Test
	public void read_image_data()
	{	String filepath = "C:\\Users\\Lenovo\\Downloads\\1.png";//Convert the jpeg images in PNG format
		File imgfile = new File(filepath);
		System.out.println("~~~~~~~~~ inside read iame data test ~~~~~~~~");
		ITesseract instance = new Tesseract();
		try {
			instance.setDatapath("G:\\gm_automation\\GoodmeetingsAutomation\\tessdata");
			String data = instance.doOCR(imgfile);
			System.out.println("data from image : "+data);
		} catch (TesseractException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
