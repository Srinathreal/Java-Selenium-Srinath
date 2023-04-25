package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//
//		Thread.sleep(3000);
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("window.scrollBy(0,1000)");
//		Thread.sleep(3000);
//		executor.executeScript("window.scrollBy(0,-1000)");
//		Thread.sleep(3000);
//		// bottom page
//		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Thread.sleep(3000);
//		executor.executeScript("window.scrollBy(0,0)" );
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement Gmail = driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));
		Actions ac = new Actions(driver);
		ac.contextClick(Gmail).perform();


	}
}
