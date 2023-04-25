package org.seleniumap;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*SCROLLING UP AND DOWN
 *=====================
 *We have to use Java script Executor for scrolling.
 *
 * Javascript function to scroll down:
 * -----------------------------------
 * window.scrollBy(x,y)  x--> horizontal y--> vertical
 * or window.scroll(x,y)
 * 
 * Javascript function to scroll Up:
 * ----------------------------------
 * window.scroll(x,-y)
 * 
 * scrolling to Bottom of a page:
 * ------------------------------
 * window.scrollTo(0, document.body.scrollHeight)
 * 
 * Scrolling to Top of a Page:
 * ---------------------------
 * window.scrollTo(0,0)
 * 
 * Scroll to a particular position where an element is present:
 * -----------------------------------------------------------
 * "(arguments[0].scrollIntoView(true);",element)
 * 
 * -------------------------------------------------------------------------------
 * Using Robot
 * ----------
 * 
 * Robot robot = new Robot();
 * robot.keyPress(KeyEvent.VK_PAGE_DOWN);
 * robot.keyrelease(KeyEvent.VK_PAGE_DOWN);
 * ==================================================================================
 * 
 * 
 * 
 * 
 * 
 * 
 */



public class ScrollUpDownEx {


	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://www.leafground.com/");
	driver.manage().window().maximize();
	
	
	//scroll to some position
	JavascriptExecutor executor = (JavascriptExecutor) driver;
//	executor.executeScript("window.scroll(0,450)", ""); //0=horizontal axis , 450 = vertical axis
	//to down
	Thread.sleep(3000);
	//to up
//	executor.executeScript("window.scroll(0,-450)", "");

	//scroll to bottom of the page
//	executor.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
	
	//To bottom
//	Thread.sleep(3000);
	//To up
//	executor.executeScript("window.scroll(0,0)","");
	
	//go to a specific element position
	WebElement link = driver.findElement(By.linkText("Tool Tip"));
	executor.executeScript("arguments[0].scrollIntoView(true);",link);
	
	//Robot class
//	Robot robot = new Robot();
//	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
//Thread.sleep(3000);
//    robot.keyPress(KeyEvent.VK_PAGE_UP);
//    robot.keyRelease(KeyEvent.VK_PAGE_UP);
//
//	
	
	
	
	
	
	}
	
}
