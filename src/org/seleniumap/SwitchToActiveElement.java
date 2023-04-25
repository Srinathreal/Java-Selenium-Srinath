package org.seleniumap;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class SwitchToActiveElement {
	static WebElement q;
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
	
		driver.switchTo().activeElement().sendKeys("chennai\n");    //1 method
		//here, we switch driver to active element
		//active element nameitself tells that one element is active and we can
		//give sendkeys without findelement.
	
		PageFactory.initElements(driver, SwitchToActiveElement.class);  //2 method
		q.sendKeys("chennai");
		
	}
}
