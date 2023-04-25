package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	//IMPORTANT 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		
		Thread.sleep(3000);
		driver.close();   //it closes the current window THAT DRIVER'S HAS FOCUS OF...NOT USER'S.
		//WHICH IS LEAFGROUND WINDOW PAGE<--(CLOSED BY DRIVER),... NOT HOME PAGE !
		
		//driver.close() --> CLOSE THE BROWSER WINDOW THAT THE DRIVER HAS FOCUS OF.
		//driver.quit() --> CLOSE ALL BROWSER SESSIONS (WINDOWS) ASSOCIATED TO WEB DRIVER.
		
	//	driver.quit();
		
		
	}
}
