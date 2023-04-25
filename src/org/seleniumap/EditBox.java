package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='wp-categories-icon svg-image'])[1]")).click();
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("test");
		String value = driver.findElement(By.xpath("(//input[@type='text'])[3]")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		WebElement isdisabled = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		boolean enabled = isdisabled.isEnabled();
		System.out.println(enabled);
		driver.quit();

	}
}
