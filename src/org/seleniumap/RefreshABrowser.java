package org.seleniumap;
/*
 * Different ways to refresh a browser
 * -----------------------------------
 * 1. Refresh command (driver.navigate.refresh())
 * 2. driver.getcurrenturl()
 * 3. JavaScript Executor: location.reload() or hostory.go(0)
 * 4. Robot class f5
 * 
 * F5 via sendkeys -> not working,  (searchbutton.sendKeys(Keys.F5);)
 * but its listed on almost all the sites.
 * 
 * Sendkeys using ASCII code -> \uE035 is F5 equivalent (not working)
 * 
 * 
 */

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshABrowser {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement searchbutton = driver.findElement(By.name("q"));
		searchbutton.sendKeys("Riya");
		
		//Refresh command
		driver.navigate().refresh();   //1 method
		
		//Get currentUrl
		driver.get(driver.getCurrentUrl());  //2 method
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("location.reload()");   //3 method or use "history.go(0)"
		
		Robot robot = new Robot();    //4 method
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		searchbutton.sendKeys(Keys.F5);  //not working
		
		
	}
}
