package org.seleniumap;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

/*
 * Fluent Wait:
 * -----------
 * The fluent wait is used to call the web driver to wait for a condition,
 * as well as the frequency with which we want to check the condition before throwing
 * an exception.
 * 
 * by setting the frequency , we are reducing the burden of default polling.
 * 
 * how to use:
 * -----------
 * Wait(I) wait =new FluentWait(C)(driver)
 * .withTimeout(30.SECONDS)
 * .pollingEvery(3, SECONDS)
 * .ignoring(Exception.class);
 * 
 * 
 * .withoutTimeout(Duration.ofseconds(30)
 * .pollingEvery(Duration.ofSeconds(2)
 * .ignoring(NOSuchElementException.class);
 * 
 * 
 * Apply Method:
 * WebElement profile = wait.until(new function()  {
 * 
 * public webelement = apply(Webdriver) {
 * 
 * return driver.findelement(By.xpath("xpath here");
 * }
 * 
 * });
 * 
 * 

 * 
 */
public class FluentWaitEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.phptravels.net/login");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		submit.click();
		
		
		//fluent wait: 
//---------------------------------------------------------------------------------
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
						
				
		
		//depricated - no longer use
		//TimeUnit.SECONDS is not in use (depricated) instead of this
		//we use Duration.ofSeconds()		
		
		WebElement profile =wait.until(new Function<WebDriver,WebElement>() {

		
			public WebElement apply(WebDriver driver) {
				return driver.findElement(
						By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a"));
			}
			
			
		});   //fluent wait
	
//-------------------------------------------------------------------------------------------
	
	
		

	//	WebElement profile = driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a"));
		profile.click();
	}
}
