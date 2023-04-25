package org.seleniumap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; //dropdown(select)

public class DropDownExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1); // select class , then pass object of webelement
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("2");
		Thread.sleep(3000);
		select.selectByVisibleText("Loadrunner");
		Thread.sleep(3000);
		/*
		 * selectByIndex, selectByValue, selectByVisibleText,
		 */
		List<WebElement> listofelements = select.getOptions(); // List <generics>
		int size = listofelements.size();
		System.out.println("number of elements:" + size);

		dropdown1.sendKeys("Selenium");
		// u can use sendkeys in dropdown also.

		WebElement multiselect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));

		Select multiselectbox = new Select(multiselect);

		multiselectbox.selectByIndex(1);
		multiselectbox.selectByIndex(2);
		multiselectbox.selectByIndex(3);

	}

}
