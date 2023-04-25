package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement agegroup = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]"));
		agegroup.click();
		boolean isselected = agegroup.isSelected();
		System.out.println(isselected);

		WebElement checked = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		checked.click();
		

		boolean isselected1 = checked.isSelected();
		System.out.println(isselected1);
		
		WebElement isselected3 = driver.findElement(By.id("yes"));
		isselected3.click();
		
		boolean status =isselected3.isSelected();
		System.out.println(status);
		
		
	}
}
