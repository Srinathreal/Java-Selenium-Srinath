package org.seleniumap;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		String oldWindow = driver.getWindowHandle(); // to get parent window.

		WebElement firstbutton = driver.findElement(By.id("home"));
		firstbutton.click();

		Set<String> handles = driver.getWindowHandles(); // to get all the windows opened

		for (String newwindow : handles) { // indha handles both new & old window are present. it(foreach) will give new
											// window.
			driver.switchTo().window(newwindow);
		}

		WebElement editbox = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img"));
		editbox.click();

		driver.close(); // to close current window.

		driver.switchTo().window(oldWindow); // to return to parent window.
		Thread.sleep(3000);
		WebElement openmultiple = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		openmultiple.click();

		int numberofwindows = driver.getWindowHandles().size();
		System.out.println("numberofwindows" + numberofwindows);
		Thread.sleep(3000);
		WebElement dontClose = driver.findElement(By.id("color"));
		dontClose.click();
		Thread.sleep(3000);
		Set<String> newwindowhandles = driver.getWindowHandles();
		for (String allwindows : newwindowhandles) {
			if (!allwindows.equals(oldWindow)) { // parent win = parent window. (to check if it is parent win or not)
				driver.switchTo().window(allwindows);
				driver.close();
			}

		}
		driver.quit();

	}
}
