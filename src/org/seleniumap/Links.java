package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//to click "link"
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Go to Home Page")).click();
		
		
		
	}
}
