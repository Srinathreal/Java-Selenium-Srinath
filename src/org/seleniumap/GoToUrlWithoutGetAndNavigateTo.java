package org.seleniumap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoToUrlWithoutGetAndNavigateTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		String  Url ="https://www.google.com";
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver; 
		executor.executeScript("window.location = \'"+ Url +"\'");
	}
	
}
