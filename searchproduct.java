package com.amazonproject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class searchproduct {
	
		WebDriver driver;
		
		public searchproduct(WebDriver driver) {
			this.driver= driver;
		}
		private String URL="https://www.amazon.in/";
		private By id =By.id("twotabsearchtextbox");
		private By submit =By.id("nav-search-submit-button");
		By lstdiv = By.xpath("(//div[contains(@class,'s-card-container')])");
		By lstlnks= By.xpath("//a[contains(@class,'s-link-style a-text-normal')]");
		
		//search prouct
		public void searchprod() throws InterruptedException {
			driver.get(URL);
			Thread.sleep(2000);
			driver.findElement(id).sendKeys("Dell Laptop");
			Thread.sleep(2000);
			driver.findElement(submit).click();
			Thread.sleep(2000);
			
	
//            listing the search products
		     List<WebElement> lstdiv = driver.findElements(By.xpath("(//div[contains(@class,'s-card-container')])"));
		    for (WebElement parentDiv : lstdiv) {
		    	List<WebElement> lstlnks = parentDiv.findElements(By.xpath(".//a[contains(@class,'s-link-style a-text-normal')]"));
				if (lstlnks.size()>0) {
					System.out.println(lstlnks.get(0).getText());
				}
			}
		}
		
		
			
}
	


