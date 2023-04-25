package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calenders {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
	
	WebElement firstclick = driver.findElement(By.id("datepicker"));
	    //firstclick.sendKeys("10/09/1997"+Keys.ENTER);   easy method.
		firstclick.click();
		
		WebElement nextbutton = driver.findElement(By.xpath("//a[@title='Next']"));
		nextbutton.click();
		
		WebElement date = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		date.click();
		//a[contains(text(),'10')]   //for text value.
		//a[@type='username']
		//(//a[@type='username'])[1]
		
	}
}
