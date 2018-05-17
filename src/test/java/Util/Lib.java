package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {

	public static String getTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	public static WebElement findElem(WebDriver driver, String xpath) {
		WebElement elem = driver.findElement(By.xpath(xpath));
		return elem;
	}

	public static String readProperties(String key) throws IOException {
		File file = new File("/Users/gazifarhana/eclipse-workspace1/Facebook1/src/test/resources/ObjectRepository/Locator.Properties");
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String locator = prop.getProperty(key);
		return locator;
	}

	public static String readexcel(WebDriver driver, int rownum, int colnum) throws IOException {

		File fl = new File("/Users/gazifarhana/eclipse-workspace1/Facebook1/src/test/resources/ObjectRepository/fb.xlsx");
		FileInputStream fis = new FileInputStream(fl);
		XSSFWorkbook wk = new XSSFWorkbook(fis);
		XSSFSheet sh = wk.getSheetAt(0);
		XSSFRow rw = sh.getRow(rownum);
		XSSFCell cell = rw.getCell(colnum);
		String value = cell.getStringCellValue();
		
		wk.close();
		
		return value;
	}

//	public static void takeScreenShot(WebDriver driver, String name) throws IOException {
//		try {
//			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(src, new File("/Users/gazifarhana/eclipse-workspace1/eBay/eBay"+name+".png"));
//		} catch (Exception e) {
//			System.out.println("Could not take Screenshot");
//		}
//	}
}
