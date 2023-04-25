package org.seleniumap;

import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Wrapp {
/*
 * Alert alert = driver.switchTo().alert();
 * alert.accept(); //accept - ok
 * confirm.dismiss();  //dismiss - cancel
 * 
 * File file = new File("C:\\Users\\srina\\Downloads"); // java
   File[] listofFiles = file.listFiles();
 * 
 * 
	WebElement from = driver.findElement(By.id("draggable"));
    WebElement to = driver.findElement(By.id("droppable"));
		
	Actions actions = new Actions(driver);  // (keyboard work)
    actions.clickAndHold(from).moveToElement(to).release(to).build().perform();// method 1
      //to click nd hold. move nd release and build perform to work.
		
    actions.dragAndDrop(from, to).build().perform(); //method 2
		
        
 *   Select select = new Select(dropdown1); // select class , then pass object of webelement
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("2");
		Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");
		Thread.sleep(3000);
		

 * 
 * driver.manage().timeouts().implicitlywait(30,TimeUnit.SECONDS);
 * default wait - 0 sec
 * 
 * WebDriverWait wait = new WebDriverWait(driver, 30);
   WebElement profile=	wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a")));
 * 
 *  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
						
				
 * 
 *  	
	Robot robot = new Robot();    //4 method
	robot.keyPress(KeyEvent.VK_F5);
	robot.keyRelease(KeyEvent.VK_F5);
 * 
 *  JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("location.reload()");   
 * 
 *   TakesScreenshot screenshot = (TakesScreenshot) driver;
 *   File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
 *   File destinationfile = new File("D://sample.png") ;  
     FileHandler.copy(sourcefile, destinationfile);
 *  
 *   FileHandler - selenium inbuilt one.
	 //FileUtils - java one
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
}
