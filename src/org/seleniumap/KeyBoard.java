package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoard {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/index.php");
	driver.manage().window().maximize();
	WebElement x = driver.findElement(By.id("username"));
	x.sendKeys("Sri");
	WebElement x1 = driver.findElement(By.name("password"));
	x.sendKeys(Keys.CONTROL,"c");
	x1.sendKeys(Keys.CONTROL,"v");
	}
}
