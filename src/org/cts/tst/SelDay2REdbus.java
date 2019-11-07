package org.cts.tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelDay2REdbus {
	

public static void main(String[] args) {
	
	
	int id = 10;
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\SelDay2Testq2\\selDriver\\chromedriver76Version.exe");
	
	WebDriver d = new ChromeDriver();
	
	d.get("https://www.redbus.in");
	
	WebElement Login = d.findElement(By.id("src"));
	
	Login.sendKeys("chennai");
	
	WebElement pass = d.findElement(By.id("dest"));
	
	pass.sendKeys("pondicvherry");
	
	
	
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\Sample\\driver\\geckodriver23.exe");

	WebDriver a = new FilrefoxDriver();

	a.get("https://www.facebook.com/");
	String title = a.getTitle();
	System.out.println(title);
	String currentUrl = a.getCurrentUrl();
	System.out.println(currentUrl);

	WebElement findElement = a.findElement(By.id("email"));
	findElement.sendKeys("abc@gmailcom");
	WebElement findEle = a.findElement(By.id("pass"));

	findEle.sendKeys("12345");
}
}
