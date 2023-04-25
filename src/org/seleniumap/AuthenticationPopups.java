package org.seleniumap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Handling Authentication Pop Ups In selenium!
 * ------------------------------------------
 * AUT - (Application under Test) = https://the-internet.herokuapp.com/basic_auth
 * 
 *  
 * Problem:
 * 1. We can't inspect and sendkeys
 *  
 * How to solve:
 *  1. Use a Third Party tools like sikuli, AutoIt
 *  2.https://username:password@url.com //sending credentials via URL
 * (this is best method)
 * 
 * 
 */
public class AuthenticationPopups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//https://username:password@url.com 
		//sending credentials via URL
		driver.manage().window().maximize();
	
		
	}
}
