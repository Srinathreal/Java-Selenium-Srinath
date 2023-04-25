package org.seleniumap;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResultURLs {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("12 angry men \n");  //  \n --> next page or enter like that.
		Thread.sleep(3000);
		
		List<WebElement> totallinks = driver.findElements(By.xpath("//a"));

		// This will print all the URLs in the page.
		for (WebElement links : totallinks) {
			System.out.println(links.getAttribute("href"));
		}

		
		
		//fetch only main links
		List<WebElement> mainlinks = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div//following::cite"));
for (WebElement main : mainlinks) {
	System.out.println(main.getText());
}
		
		
		
	}
}
