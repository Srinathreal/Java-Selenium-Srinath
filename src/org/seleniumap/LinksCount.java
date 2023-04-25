package org.seleniumap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		List<WebElement> multipleelements = driver.findElements(By.tagName("a"));
		System.out.println(multipleelements.size()); 
		
		for (WebElement webElement : multipleelements) {
			System.out.println(webElement.getAttribute("href"));
		}
	}
}
