package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeEx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe"); //./=current project
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id(""));
//		Boolean username = driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9']")).isDisplayed();
//		if (username==true) {
//			System.out.println("displayed");
//		}
//		else {
//			System.out.println("notdisplayed");
//		}

		String attribute = username.getAttribute("value");
		System.out.println(attribute);

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("uguigig");

		String attribute2 = password.getAttribute("value");
		System.out.println(attribute2);
		// if u want to get the text that ur entered into a text field
		// ----use getattribute("value")
		driver.close();
	}

}
