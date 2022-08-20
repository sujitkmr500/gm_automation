package ai.gm.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import ai.gm.qa.base.TestBase;

public class GMUtils extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 30;
	public static long IMPLICIT_WAIT = 20;
	
	public static String TESTDATA_SHEET_PATH = "G:\\gm_automation\\GoodmeetingsAutomation\\src\\main\\java\\ai\\gm\\qa\\testdata\\Goodmeetingstestdata.xlsx";
	
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	
	
	public void switchToFrame()
	{
		driver.switchTo().frame("----<framename>---");
	}
	// Two dimensional object array
	public static Object[][] getTestData(String sheetName)
	{
		FileInputStream file = null;
		try {
			System.out.println("TESTDATA_SHEET_PATH :"+TESTDATA_SHEET_PATH);
			file = new FileInputStream(TESTDATA_SHEET_PATH);
			//System.out.println("file :"+file);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			book = WorkbookFactory.create(file);
		}
		catch(InvalidFormatException e){
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println("LastRowNum : "+sheet.getLastRowNum());
		System.out.println("LastCellNum : "+sheet.getRow(0).getLastCellNum());
		//row loop
		for(int i = 0;i<sheet.getLastRowNum();i++)
		{
			//coloumn loop
			for(int k = 0;k < sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
				System.out.println(" ~ "+data[i][k]);
			}
		}
		
		
		return data;
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
	

}
