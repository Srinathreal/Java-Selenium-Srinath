package org.seleniumap;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToPressEnterKey {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("chennai"+Keys.ENTER);  //1 method
		
		searchBox.sendKeys("chennai");
		searchBox.submit();                        //2 method
		
		Robot robot = new Robot();                  // 3 method
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		searchBox.sendKeys("chennai \n");    //4 method
		
	}
}
