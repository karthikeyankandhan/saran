package org.cts.tst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDay2Testq2 {

	public static void main(String[] args)
	
{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\SelDay2Testq2\\selDriver\\chromedriver76Version.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");

		String title = d.getTitle();
		
		System.out.println(title);
		
		WebElement findElement = d.findElement(By.id("email"));
		findElement.sendKeys("poovitha");
		
		WebElement findElement1 = d.findElement(By.id("pass"));
		findElement1.sendKeys("1234");
		
		WebElement findElement3 = d.findElement(By.xpath("//input[@value='Log In']"));
		findElement3.click();
		
		
		
		
}

}
