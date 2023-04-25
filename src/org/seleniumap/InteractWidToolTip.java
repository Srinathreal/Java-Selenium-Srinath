package org.seleniumap;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWidToolTip {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement name = driver.findElement(By.id("age"));
		String ToolTipText = name.getAttribute("title");
		System.out.println(ToolTipText);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
