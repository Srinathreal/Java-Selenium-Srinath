package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sintro {
/*TEST AUTOMATION - getting Started
 * 
 * aim: Automation - web appilication
 * programming lang: Java
 * automation framework: Selenium
 * IDE(integrated development environment) - Eclipse
 * automation script: Java + Selenium
 * 
    System.setProperty("webdriver.chrome.driver","location.exe")   (CHROME)
    WebDriver driver = new ChromeDriver();
    
    System.setProperty("webdriver.gecko.driver","loactionofdriver.exe")  (BROWSER)
    WebDriver driver = new FirefoxDriver(); 
    
 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
		// id - name - classname - xpath ,sendkeys  , keys. 
		
		
		
		
		
		
		
		
	}
}
