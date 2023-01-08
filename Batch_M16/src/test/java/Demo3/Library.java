package Demo3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.utility.RandomString;


public class Library {
public static void ScrollToElement(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		
	}
	
	public static void CaptureScreenshot(WebDriver driver) throws Exception {
		 String RM=RandomString.make(3); // abc
	     
	     TakesScreenshot ts=(TakesScreenshot) driver;
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     File destn=new File("C:\\Users\\devra\\eclipse-workspace\\Batch_M16\\Screenshot"+RM+".png");
	     FileUtils.copyFile(src, destn);
	     
	}
	public static void CaptureScreenshot_Element(WebElement element) throws Exception {
		
		
	     File src1=element.getScreenshotAs(OutputType.FILE);
	     File destn1=new File("C:\\Users\\devra\\eclipse-workspace\\Batch_M16\\Screenshot\\logo.png");
	     FileUtils.copyFile(src1, destn1);
	}
	
	public static Alert getAlertHandle(WebDriver driver) {
		
		 return driver.switchTo().alert();
	}

	public static String getStringData_Excel(String sheetname,int row,int cell) throws Exception {
		
		String path="C:\\Users\\devra\\eclipse-workspace\\Batch_M16\\Excel\\Data1.xlsx";
		FileInputStream file=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
	
	
	

}
