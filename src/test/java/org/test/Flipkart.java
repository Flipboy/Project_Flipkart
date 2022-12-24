package org.test;

import java.util.Date;

import org.base.BasePage;
import org.login.LpFlipkart;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart extends BasePage {

	@BeforeClass
	
	private void Beforeclass() {
		
		launchBrowser("chrome");
	}
	
	@AfterClass
	private void Afterclass() {
	
		System.out.println("Test Executed");

	}
	
	
	@BeforeMethod
	private void Beformethod() {
		System.out.println("\n Test Starts"+ new Date() );

	}
	
	@AfterMethod
	private void AfterMethod() {
		System.out.println(" \n Test Ends "+new Date());

	}
	@Test
	private void productlist() {
		
		urlLaunch("https://www.flipkart.com/");
		implicitlyWait(60);
		pageLoadTimeout(60);
		
		LpFlipkart l = new LpFlipkart();
		click(l.getClosebtn());
		sendkeys(l.getTxtBox(), "insta 360");
		click(l.getScrbtn());
		
		System.out.println("All products List");
		LpFlipkart.AllProducts();
		
		
		

	}
	@Test
	public static void productprice() {
		urlLaunch("https://www.flipkart.com/");
		implicitlyWait(60);
		pageLoadTimeout(60);
		
		LpFlipkart l = new LpFlipkart();
//		click(l.getClosebtn());
		sendkeys(l.getTxtBox(), "insta 360");
		click(l.getScrbtn());

		System.out.println("All products price");
		l.ProductPrice();

	}
	
	
	
	
}
