package org.seleniumap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.switchTo().frame(0); // first frame
		WebElement buttonone = driver.findElement(By.id("Click"));
		buttonone.click();

		String text = driver.findElement(By.id("Click")).getText();
		System.out.println(text);

		// frame = oru html kulla innoru html irukardha artham.
		// html-html

		// Nested frame = oru html kulla innoru html iruku adhukulla innoru frame .
		// html-html-html

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement button2 = driver.findElement(By.id("Click1"));
		button2.click();

		// total no .of frames
		driver.switchTo().defaultContent();  //to return to original frame

		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int size = totalframes.size();
		System.out.println(size);
		
		//to enter into frame - switchto frame 
		//to enter into alert - switchto alert
		//to enter into window - switchto window
		
	}
}
