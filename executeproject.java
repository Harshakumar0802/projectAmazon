package com.amazonproject;

import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.WebSocket;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class executeproject {
	static searchproduct searchprod;
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "/home/kumarharshith08/chromedriver/chromedriver");
		
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	
		searchprod = new searchproduct(driver);
		searchprod.searchprod();
		
		com.amazonproject.menu openmenu = new menu(driver);
		openmenu.openbestseller();
		openmenu.openmobiles();
		openmenu.openfashion();

	
	}

}
