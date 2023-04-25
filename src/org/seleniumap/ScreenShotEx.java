package org.seleniumap;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;  
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

/*Take a screenShot in selenium
 * -------------------------------
 * 1.Using selenium's //TakesScreenShot//(interface)
 * NOTE:
 * Everyone use to say "take" actually it is "Takes"
 * 2 call GetScreenShotAs method and store it in  a file.
 * 3 Create an image file in any location.
 * 4.Copy the screenshot in destinationFile (image) file, Using FileUtils.(commons-io)
 * or we can use Selenium's fileHandler as well to copy the file.
 * 
 * Another Way to Take Screenshot:
 * 
 * Robot class.
 * 
 * Now hold on... why there are two ways to implement same things.
 * 
 * isn't Selenium's TakesScreenshot enough?
 * Its more than enough.
 * But if we have below requirments,
 * 
 * when we Take screen shot when alert is open.
 * It will give you an exception stating "org.openqa.selenium.UnhandledAlertException"
 * 
 *Take full ScreenShot (including address bar and tab opened.)
 *
 *----------------------------------------------------------------------
 *SCREENSHOT VIA Robot Class.
 *-----------------------------
 *1. Create an object of Robot class.
 *2. Get the Screen Size and store.
 *3. Use rectangle class and pass the screen size.
 *4. Use create Screen Capture(Rectangle) of robot class and capture screenshot.(source)
 *5. Define Destination path file for Screenshot.
 *6. write temp file into destination file. (Image IO)
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
 * 
 * 
 * 
 */

public class ScreenShotEx {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	          driver.navigate().to("http://www.leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	
	//screenshot
//	TakesScreenshot screenshot = (TakesScreenshot) driver;
	//driver ah screenshot edukirom, driver vandhu webdriver type adha namma screenshot la store 
	//panna mudiyadhu...so, we typecasting the driver..(TakesScreenshot) driver;
	
	//------------------------------------------------------------------------------------------
//	      File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
	//getScreenShotAs -- method
	//default value - null
	//OutputType<x> --> Interface
	//FILE la output store panrom..
	//getscreenshotas yoda return type --> file
	//File --class
	
	//-------------------------------------------------------------------------------------------
	//location enga apidinu mention panna File classku object create panrom
//	   File destinationfile = new File("D://sample.png") ;  
	
//	FileHandler.copy(sourcefile, destinationfile);
	
	//FileUtils - org.apache.commons.io.FileUtils;
	
	//IOException will throw when we use fileutils.
	
	//FileHandler - selenium inbuilt one.
	//FileUtils - java one
	
	//-------------------------------------------------------------------------------------
	//robot class  taking screen shot using robot class.
	
	//after clicling alert box
	WebElement alertbox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
	alertbox.click();
	
	
	Robot robot = new Robot();
	
	
	//to take screen size we use Toolkit (java yoda awt package) by using this we can get screen size.
	  Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	//and then, stored in dimension datatype.
	
	//Rectangle class (java awt package)
	Rectangle rectangle = new Rectangle(screensize);
	//to get dimension size of screensize
	
	    BufferedImage sourcefile1=  robot.createScreenCapture(rectangle);
	//Use create Screen Capture(Rectangle) of robot class and capture screenshot.(source)
	//and stored in bufferd image.
	
	    File destinationfile1 = new File("D://robotsnap.png");
	    
	    ImageIO.write(sourcefile1, "png", destinationfile1);
	
	// indha source file ah namma dest file la poduradhuku namma ImageIO.write nudra oru class use panrom
	    
	 //rendered image - source file, format - png , destination - destination file.   
	    
	    
	    
	    
	}
	
}
