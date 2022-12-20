package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.Element;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	static Actions a;
	static Robot r;
	static TakesScreenshot tk;
	
// Browser Launch	
public static void BrowserLaunch() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
}
// URL launch
public static void LaunchUrl(String url) {
    driver.get(url);
}
// To get the Page Title
public static String pageTitle() {
    String title = driver.getTitle();
    System.out.println(title);
    return title;
}
// To get the page URl
public static String pageUrl() {
      String currentUrl = driver.getCurrentUrl();
      System.out.println(currentUrl);
      return currentUrl;
}
// Sendkeys() method
public static void fillTextBox(WebElement ele,String value) {
       ele.sendKeys(value);
	
}
//Click() method
public static  void btnClick(WebElement element) {
      element.click();
}
// findElement() method
public static WebElement findElement(By name) {
	
	return driver.findElement(name);
}
// To close the Browser
public static void closeBrowser() {
      driver.close();
}

//get attribute from the text box
public static void getAttribute() {

}

//maximize the window
public static void maxiwindow() {
 driver.manage().window().maximize();
}
// Double click() method
public static void clickDouble(WebElement element) {
    a = new Actions(driver);
    
    a.doubleClick(element).perform();
    
    
}
//RightClick() method
private void contextClick() {
	a.contextClick().perform();
}
// Drag & Drop method
public static void DragandDrop(WebElement drag,WebElement drop) {
     a.dragAndDrop(drag, drop).perform();
     
}
// Mouse Over-----using moveToElements() method
private void mouseover(WebElement ele) {
	a.moveToElement(ele);
}
// copy
public static void copy(WebElement element) throws AWTException {
    r = new Robot();
    
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_C);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_C);
    
}
// paste
public static void paste() {
	
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_V);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_V);
}
// To take the ScreenShot
public static void screenShot(String name) throws IOException {
	
	tk = (TakesScreenshot)driver;
	
    File as = tk.getScreenshotAs(OutputType.FILE);

	File f = new File("C:\\Users\\KEERTHIVENKAT\\eclipse-workspace\\MavenProject\\SreenShot\\"+name+".png");
	
	FileUtils.copyFile(as, f);
		
}

// JavaScriptExecutor() method used instead of sendkeus and click
public static void javaScriptExecutor(String javacode,WebElement ele) {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript(javacode, ele);
}

// to pass the Test Data in to the webpage 
public static String readFromExcel(String sheetname,int rowNo,int CellNo) throws IOException {

	File f = new File("C:\\Users\\KEERTHIVENKAT\\eclipse-workspace\\MavenProject\\ExternalFiles\\Data.xlsx");
	
	FileInputStream fin = new FileInputStream(f);
	
	Workbook book = new XSSFWorkbook(fin);
	
	Sheet s = book.getSheet(sheetname);
	
	Row r = s.getRow(rowNo);
	
	Cell c = r.getCell(CellNo);
	
	int cellType = c.getCellType();
	
	String name="";
	if (cellType==1) {
		 name = c.getStringCellValue();
		
	}
	else if (DateUtil.isCellDateFormatted(c)) {
		Date dateCellValue = c.getDateCellValue();
		
		SimpleDateFormat sim = new SimpleDateFormat("dd MMM YYYY");
		
		 name = sim.format(dateCellValue);
		
	}
	
	else {
		double numericCellValue = c.getNumericCellValue();
		
		long lo = (long)numericCellValue;
		
		name = String.valueOf(lo);
		
		
	}
	
	return name;
	
	
	
	
}

public static void getDate() {
	Date d = new Date();
	System.out.println(d);
}


}
