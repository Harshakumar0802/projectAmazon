package com.amazonproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class menu {
	
	WebDriver driver;
	public menu(WebDriver driver) {
		this.driver= driver;

	}
	
	By allmenuItems= By.xpath("//div[@id='nav-xshop-container']//a");
    By bestsellers =By.xpath("//div[@id='nav-xshop-container']//a[contains(text(), 'Best Sellers')]");
    By mobiles = By.xpath("//div[@id='nav-xshop-container']//a[contains(text(), 'Mobiles')]");
    By fashion = By.xpath("//div[@id='nav-xshop-container']//a[contains(text(), 'Fashion')]");
    String homepage="https://www.amazon.in/";
	
    public void openbestseller() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.findElement(bestsellers).click();
    	Thread.sleep(3000);
    	
    }
    public void openmobiles() throws InterruptedException {
    	driver.navigate().to(homepage);
    	Thread.sleep(3000);
    	driver.findElement(mobiles).click();
    	Thread.sleep(3000);

	}
    public void openfashion() throws InterruptedException {
    	driver.navigate().to(homepage);
    	Thread.sleep(3000);
    	driver.findElement(fashion).click();
    	Thread.sleep(3000);

	}
    	
 }
	





