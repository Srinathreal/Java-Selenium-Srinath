package org.seleniumap;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

	
		String parentwindow = driver.getWindowHandle();  //parent window

		WebElement mobile = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[2]"));
		Thread.sleep(3000);
		Actions ac = new Actions(driver);
		ac.contextClick(mobile).perform(); // to right click the mobile

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement todaydeal = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[3]"));
		Thread.sleep(3000);
		ac.contextClick(todaydeal).perform(); // to right click the todaydeal

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		WebElement Customs = driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]"));
		ac.contextClick(Customs).perform();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Set<String> AllWindows = driver.getWindowHandles();
		ArrayList<String> all = new ArrayList<>(AllWindows);

		String title = driver.switchTo().window(all.get(0)).getTitle();
		System.out.println(title);

		String title2 = driver.switchTo().window(all.get(1)).getTitle();
		System.out.println(title2);
  
		String title3 = driver.switchTo().window(all.get(2)).getTitle();
		System.out.println(title3);

		for (String allwindows : all) {
			if (!allwindows.equals(parentwindow)) {  //if allwindows are not eaqual to parentwindow then close it.
				driver.switchTo().window(allwindows);
				driver.close();
			}

		}

	}

}
