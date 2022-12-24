package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	public static WebDriver driver ;
	public static WebDriver chrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver launchBrowser(String BrowserName) {
		if (BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}

	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void implicitlyWait(int a) {

		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);

	}

	public static void pageLoadTimeout(int a) {
		driver.manage().timeouts().pageLoadTimeout(a, TimeUnit.SECONDS);
	}

	public static  void wait(int a) throws InterruptedException {
		Thread.sleep(a);

	}

	public static void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void sendkeysenter(WebElement e, String value, Keys Enter) {

		e.sendKeys(value, Keys.ENTER);


	}
	public static void click(WebElement e) {
		e.click();

	}

	public static String getText(WebElement e) {
		String text = e.getText();
		return text;

	}

	public static String getAttribute(WebElement e , String value) {

		String attribute = e.getAttribute(value);
		return attribute;
	}

	public static String getcurrenturl() {

		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}


	public static void movetoElement(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).build().perform();
	}

	public static void movetoelementclick(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).click().build().perform();

	}

	public static void clicktarget(WebElement e) {
		Actions a = new Actions(driver);
		a.click(e).build().perform();
	}

	public static void clickhold(WebElement e) {
		Actions a = new Actions(driver);
		a.clickAndHold(e).build().perform();

	}

	public static void release(WebElement e) {
		Actions a = new Actions(driver);
		a.release(e).build().perform();

	}

	public static void dragdrop(WebElement src , WebElement tar) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tar).build().perform();
	}
	public static void contextClick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).build().perform();

	}

	public static void doubleClick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).build().perform();
	}

	public static void sendkeysa(WebElement e, String value ) {
		Actions a = new Actions(driver);
		a.sendKeys(e, value).build().perform();
	}

//	public static void scrolltoElementa(WebElement e ) {
//		Actions a = new Actions(driver);
//		a.scrollToElement(e).build().perform();
//	}



	public static void selectbyindex(WebElement e, int i) {
		Select s = new Select(e);
		s.selectByIndex(i);

	}

	public static void selectByValue(WebElement e,String value ) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement e,String text ) {
		Select s = new Select(e);
		s.selectByVisibleText(text);
	}	
	public static void deselectAll(WebElement e) {
		Select s = new Select(e);
		s.deselectAll();
	}

	public static void deselectByIndex(WebElement e, int i) {
		Select s = new Select(e);
		s.deselectByIndex(i);
	}
	public static void deselectByValue(WebElement e,String value ) {
		Select s = new Select(e);
		s.deselectByValue(value);
	}

	public static void deselectByVisibleText(WebElement e,String text ) {
		Select s = new Select(e);
		s.deselectByVisibleText(text);	

	}

	public static void kpDown(int vkDown) throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}

	public static void krDown(int vkDown) throws AWTException {

		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void kpUp(int vkDown) throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
	}

	public static void krUp(int vkUp) throws AWTException {

		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void kpEnter(int vkEnter) throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public static void krEnter(int vkEnter) throws AWTException {

		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void kpControl(int VK_CONTROL) throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
	}

	public static void krControl(int VK_CONTROL) throws AWTException {

		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void kpbacksp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
	}

	public static void krbacksp() throws AWTException {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}



	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();	
	}

	public static void sendkeysAlert(String value) {
		driver.switchTo().alert().sendKeys(value);

	}
	public static WebDriver getWindowHandles(int i) {

		Set<String> allwindow = driver.getWindowHandles();
		int count=1;
		for (String eachWindow : allwindow) {
			if (count==i) {
				driver.switchTo().window(eachWindow);
			}
			count++;
		}
		return driver;
	}

	public static  void takesScreenshot(String filename) throws IOException {

		TakesScreenshot tks = (TakesScreenshot) driver;
		File scr = tks.getScreenshotAs(OutputType.FILE);
		File dst = new File("E:\\AKASH\\Maven\\Eclipse-Workspace\\MavenBase\\ScreenShots\\"+filename+".jpg");
		FileUtils.copyFile(scr, dst);	
	}

	public static String readExcel(String filename , String sheet, int r , int c) throws IOException {

		File f = new File("E:\\AKASH\\Maven\\Eclipse-Workspace\\MavenBase\\Excel\\"+filename+".xlsx");

		FileInputStream fins = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fins);

		Sheet s = w.getSheet(sheet);

		Row row = s.getRow(r);


		Cell cell = row.getCell(c); 

		int type = cell.getCellType();

		String value = null;
		if (type==1) {

			value = cell.getStringCellValue(); 

		}
		else{
			if(DateUtil.isCellDateFormatted(cell) ) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy");
				value = sd.format(dateCellValue);					
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long num = (long) numericCellValue;
				value = String.valueOf(num); 
			}
		}
		return value;
	}

}
