package org.seleniumap;
//to print the suggestions 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheGoogleSuggestions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("game of thrones");
		Thread.sleep(3000);

		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
// to get suggestions use following xpath method.

		
// to print suggestionlist use foreach method	1	
//		for (WebElement suggestionlist : suggestions) {
//			System.out.println(suggestionlist.getText());
			
//===================================================================================================================			
// to get specific part in suggestionlist		 (here, we clicked 3rd position one)	2
//			int position=0;
//			for (WebElement suggestionlist : suggestions) {
//				System.out.println(suggestionlist.getText());
//				position++;
		
//			if (position==3) {
//				suggestionlist.click();
//				break;
//			}
//----------------------------------------------------------------------------------------------------			
//			 to get specific keyword ex: 3
		
				for (WebElement suggestionlist : suggestions) {
					String text = suggestionlist.getText();
					System.out.println(text);
			if (text.contains("cast")) {
				suggestionlist.click();
				break;
			}
			
			
		}
	}
}