package org.seleniumap;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEx {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement from = driver.findElement(By.id("draggable"));
        WebElement to = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);  // (keyboard work)
        actions.clickAndHold(from).moveToElement(to).release(to).build().perform();// method 1
      //to click nd hold. move nd release and build perform to work.
		
        actions.dragAndDrop(from, to).build().perform(); //method 2
		
        
        
        
        
		
	}
}
