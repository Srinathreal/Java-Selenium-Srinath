package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// 1.Get position Button
		WebElement getpositionButton = driver.findElement(By.id("position"));

		Point xypoint = getpositionButton.getLocation();
		int getx = xypoint.getX(); // return type is integer . so we use int in front.
		int gety = xypoint.getY(); // to know the return type , mouseover to the method it will tell the return
									// type.

		System.out.println("X value is:" +getx + " Y value is:" +gety);

		// 2.Find the color
		WebElement Colorbutton = driver.findElement(By.id("color"));
		String color = Colorbutton.getCssValue("background-color");
		System.out.println("color button"+color);

		// 3.Find the Size
		WebElement Size = driver.findElement(By.id("size"));
		int height = Size.getSize().getHeight();
		int Width = Size.getSize().getWidth();

		System.out.println("height is:" +height + "width is:" +Width);

		// 4.home page
		WebElement HomeButton = driver.findElement(By.id("home"));
		HomeButton.click();

	}
}
