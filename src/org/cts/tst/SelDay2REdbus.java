package org.cts.tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDay2REdbus {
	

public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\SelDay2Testq2\\selDriver\\chromedriver76Version.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.redbus.in");
	
	WebElement Login = d.findElement(By.id("src"));
	
	Login.sendKeys("chennai");
	
	WebElement pass = d.findElement(By.id("dest"));
	
	pass.sendKeys("pondicvherry");
	
	
}
}
