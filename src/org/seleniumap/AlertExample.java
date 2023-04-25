package org.seleniumap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement AlertBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		AlertBox.click();
		// now alert will appear. so, we use Alert operation here.
		Alert alert = driver.switchTo().alert(); // alert- switch control from driver to alert by 'switchTo' method.
		Thread.sleep(3000);
		alert.accept(); // accept - ok

		WebElement confirmBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(3000);
		confirm.dismiss(); // dismiss - cancel

		WebElement promptBox = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		promptBox.click();
		Alert prompt = driver.switchTo().alert();

		prompt.sendKeys("SRINATH"); // test enter and then accept
		Thread.sleep(3000);
		prompt.accept();

		WebElement sweetalert = driver.findElement(By.id("btn"));
		sweetalert.click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button")).click();
		// the end//

	}
}
