package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Browser {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		/*
		 * Thread.sleep(3000);
		 * driver.findElement(By.name("field-keywords")).sendKeys("redminote 8");
		 * 
		 * driver.findElement(By.id("nav-search-submit-button")).click();
		 * Thread.sleep(1000); driver.findElement(By.
		 * xpath("(//i[contains(@class,'a-icon a-icon-checkbox')])[3]")).click();
		 * 
		 * Thread.sleep(3000);
		 * driver.get("http://demo.automationtesting.in/Alerts.html");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("(//a[contains(@class,'analystic')])[1]")).click(
		 * ); Thread.sleep(3000);
		 * driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger')]")).
		 * click(); Thread.sleep(3000); driver.switchTo().alert().accept();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("(//a[contains(@class,'analystic')])[2]")).click(
		 * ); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).
		 * click(); Thread.sleep(2000); driver.switchTo().alert().accept();
		 * driver.findElement(By.xpath("(//a[contains(@class,'analystic')])[3]")).click(
		 * ); Thread.sleep(2000);
		 * driver.findElement(By.xpath("(//button[contains(@class,'btn btn-info')])")).
		 * click(); Thread.sleep(2000); driver.switchTo().alert().accept();
		 * Thread.sleep(4000);
		 */

		driver.navigate().to("https://www.facebook.com/signup");
		Thread.sleep(2000);
		WebElement Day = driver.findElement(By.xpath("//select[contains(@title,'Day')]")); // return type.
		Day.click();
		Select s1 = new Select(Day); // object creation.
		s1.selectByIndex(6);
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Sep"); // without return type.
		Thread.sleep(1000);
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']")); // return type.
		Year.click();
		Select s2 = new Select(Year);
		s2.selectByVisibleText("1997");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

		driver.navigate().to("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		WebElement findElement = driver.findElement(By.xpath("//select[contains(@id,'mySelect')]"));
		findElement.click();

		Select s3 = new Select(findElement);
		s3.selectByIndex(3);
		Thread.sleep(3000);
		s3.selectByValue("pineapple");
		Thread.sleep(3000);
		s3.selectByVisibleText("Orange");
		Thread.sleep(3000);
		s3.selectByIndex(0);
		Thread.sleep(3000);

		List<WebElement> options = s3.getOptions();
		int size = options.size();
		System.out.println(size);
		WebElement findElement2 = driver.findElement(By.xpath("//select[@id='cars']"));
		findElement2.click();
		Select s4 = new Select(findElement2);
		s4.selectByValue("saab");
		Thread.sleep(2000);
		s4.selectByVisibleText("Audi");
		Thread.sleep(2000);
		s4.selectByIndex(0);
		Thread.sleep(2000);
		s4.selectByValue("opel");

		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot) driver; // screenshot
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\srina\\eclipse-workspace\\Selenium\\Snaps\\img.png");
		FileUtils.copyFile(screenshotAs, dest);

	
	}

}
