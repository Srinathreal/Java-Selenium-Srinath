package org.seleniumap2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class RevisionSelenium {
	
/*Alert: (I)
 * 
 * Alert alert = driver.switchTo().alert();
 *  alert.accept();
 *  alert.dismiss();
 *  alert.sendKeys();    
 * --------------------------------------------
 * 
 * Download file:
 * 
		File file = new File("C:\\Users\\srina\\Downloads"); // java
		File[] listofFiles = file.listFiles();

		for (File newfiles : listofFiles) {
			newfiles.getName().equals("testleaf");
			break;
		}
 * 
 * -----------------------------------------------
 * 
 * Drag nd Drop:
 * 
 * Actions: (C)
 * 
 * Actions actions = new Actions(driver);  // (keyboard work) for (double click)
 * 
        actions.clickAndHold(from).moveToElement(to).release(to).build().perform();// method 1
        
      //to click nd hold. move nd release and build perform to work.
		
        actions.dragAndDrop(from, to).build().perform(); //method 2
		
 * 
 * --------------------------------------------------
 * 
 * Select: (C)
 * 
 *  Select select = new Select(dropdown1); // select class , then pass object of webelement
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("2");
		Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");
		Thread.sleep(3000);
		/*
 * 
 *  selectByIndex, selectByValue, selectByVisibleText,
 * 
 * ----------------------------------------------------
 * 
 * Implicit Wait:
 * //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
 * 
 * // to wait 30 seconds for full operations.

 * -------------------------------------------------
 * Explicit Wait:
 * 
 * WebDriverWait wait = new WebDriverWait(driver, 30);
 * WebElement profile=	wait.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a")));
 * 
 * ---------------------------------------------------------
 * Fluent Wait:
 * 
 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
				
 * -----------------------------------------------------------
 * Frames:
 * 
 * driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
 * 	driver.switchTo().defaultContent();  //to return to original frame

 * ---------------------------------------------------------
		//to enter into frame - switchto frame 
		//to enter into alert - switchto alert
		//to enter into window - switchto window
 * -----------------------------------------------------------
 * 
 * driver.get("http://www.google.co.in");
 *-----------------------------------------
 *  driver.navigate().back();
		   driver.navigate().forward();
		   driver.navigate().refresh();
 * ----------------------------------------
 * 
 * Refresh:
 * 
 * 	//Refresh command
		driver.navigate().refresh();   //1 method
		
		//Get currentUrl
		driver.get(driver.getCurrentUrl());  //2 method
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("location.reload()");   //3 method or use "history.go(0)"
		
		Robot robot = new Robot();    //4 method
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
 * --------------------------------------------
 * ScreenShot:(I)
 * 
 * TakesScreenshot screenshot = (TakesScreenshot) driver;
 * File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
 * File destinationfile = new File("D://sample.png") ;
 * FileHandler.copy(sourcefile, destinationfile);
 * 
 * ----------------------------------------------
 * 
 * Scroll:  for also (mouse over)
 * 
 * JavascriptExecutor (I)
 * 
 * JavascriptExecutor executor = (JavascriptExecutor) driver;
 * executor.executeScript("window.scroll(0,450)", ""); 
 * ----------------------
 * DOWN:
 * window.scrollBy(x,y)  x--> horizontal y--> vertical
 * or window.scroll(x,y)
 * --------------------------------------------------
 * UP:
 * window.scroll(x,-y)
 * ---------------------------------------------------
 * BOTTOM:
 * window.scrollTo(0, document.body.scrollHeight)
 * ---------------------------------------------------
 * TOP:
 * window.scrollTo(0,0)
 * ---------------------------------
 * ROBOT: (C)
 * 
 * Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		
 * for virtual keyboard and windows based
 * ---------------------------------
 * (I):
 * 
 * WebElement
 * WebDriver
 * Alert
 * ScreenShot
 * JavaScriptExecutor
 * -------------------------
 * (C):
 * 
 * Select
 * Robot
 * Actions
 * -----------------------------
 * 
 * DragDrop --> Actions 
 * actions.dragAndDrop(fromelement, toelement);
 * actions.build().perform();
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
 * 
 * 
 */
	
}
