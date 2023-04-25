package org.seleniumap;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplition {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("tags"));
		element.sendKeys("s");
		Thread.sleep(3000);  // we have to wait here. in order to perform the next step.  explictor impilicit time can use.
		 
		List<WebElement> listofelements = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));

		
		
		for (WebElement webElement : listofelements) {
			if (webElement.getText().equals("Web Services")) {
				webElement.click();
				break;
			}
		}

	}
}
