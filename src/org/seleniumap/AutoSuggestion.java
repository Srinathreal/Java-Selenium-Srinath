package org.seleniumap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");

		String xp = "//span[contains(text(),'selenium')]";
		List<WebElement> allSuggestions = driver.findElements(By.xpath(xp));
		// To count number of suggetions
		int count = allSuggestions.size();
		System.out.println(count);
		// To print all the suggestions
		for (int i = 0; i < count; i++) {
			WebElement suggestion = allSuggestions.get(i);
			String text = suggestion.getText();
			System.out.println(text);
		}
		// To click on last suggestion
		allSuggestions.get(count - 1).click();
	}
}
