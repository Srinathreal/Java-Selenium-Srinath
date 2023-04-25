package org.seleniumap;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
 * Go to Google Home Page
 * Mouse Over to 'Tamil'
 * There will be an underline after hovering.
 * Verify that underline is present when hovering over it.
 * 
 */
public class FindTextUnderLinedOrNot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		
		WebElement tamil = driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
		String cssValue = tamil.getCssValue("text-decoration");
		System.out.println(cssValue+" before hovering");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(tamil);
		actions.perform();
		
		String cssValue2 = tamil.getCssValue("text-decoration");
		System.out.println(cssValue2+" After hovering");
		
		
	}
}
