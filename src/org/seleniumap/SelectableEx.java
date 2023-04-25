package org.seleniumap;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableEx {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		
	    List<WebElement> selectable = driver.findElements(By.xpath("//*[@id='selectable']/li"));//(/li) for include below list)
		//to take all elements use listof web element.
		int  listsize=selectable.size();
		System.out.println(listsize);
		
		Actions actions = new Actions(driver); //used for mouse and keyboard (method 1)
		actions.keyDown(Keys.CONTROL).click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2))
		 .build().perform();
		//to hold nd click first 3 boxes  (press ctrl+hold)
		
		actions.clickAndHold(selectable.get(0));   // (method2)
		actions.clickAndHold(selectable.get(1));
		actions.clickAndHold(selectable.get(2));
		actions.build().perform();
		
		
		
		
		
	}
}
