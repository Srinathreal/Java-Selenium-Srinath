package org.seleniumap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortTablesEx {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
	//same as drag drop
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id='sortable']/li"));
		
		WebElement from = elements.get(6);
		WebElement to = elements.get(0);
		
	//actions class 	
		Actions actions = new Actions(driver);
		actions.clickAndHold(from);
		actions.moveToElement(to);
		actions.release();
		actions.build().perform();  //should be in same line 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
