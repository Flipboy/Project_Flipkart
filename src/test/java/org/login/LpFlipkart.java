package org.login;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LpFlipkart extends BasePage{

	public LpFlipkart() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void AllProducts() {
		
		List<WebElement> prdttitle = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		
		for (int i = 0; i < prdttitle.size(); i++) {
			
			System.out.println(prdttitle.get(i).getText());	
		}
	}
	
	public static void ProductPrice() {
		
		List<WebElement> prdprice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		List<Integer> li = new LinkedList<Integer>();
		for (int i = 0; i < prdprice.size(); i++) {

			li.add(Integer.parseInt(prdprice.get(i).getText().replace("₹", "").replace(",", "")));
			
			
//			System.out.println(Integer.parseInt(prdprice.get(i).getText().replace("₹", "").replace(",", "")));
			}
		System.out.println("Total number of products"+li.size()); 
		Collections.sort(li);
		System.out.println(li);
		}

//	System.out.println(Integer.parseInt(prdprice.get(i).getText().replace("₹", "").replace(",", "")));
@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
WebElement closebtn;

@FindBy(xpath = "//input[@class='_3704LK']")
WebElement txtBox;

@FindBy(xpath = "//button[@class='L0Z3Pu']")
WebElement scrbtn;

@FindBy(xpath = "//div[@class='_4rR01T']") //[]
WebElement prtkname;

public WebElement getClosebtn() {
	return closebtn;
}

public WebElement getTxtBox() {
	return txtBox;
}

public WebElement getScrbtn() {
	return scrbtn;
}








}
