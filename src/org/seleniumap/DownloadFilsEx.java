package org.seleniumap;

import java.awt.AWTException;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilsEx {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();

		WebElement downloadelement = driver.findElement(By.linkText("Download Excel")); // selenium
		downloadelement.click();

		File file = new File("C:\\Users\\srina\\Downloads"); // java
		File[] listofFiles = file.listFiles();

		for (File newfiles : listofFiles) {
			newfiles.getName().equals("testleaf");
			break;
		}
		System.out.println("download excel is downloaded.");

		WebElement downloadelement1 = driver.findElement(By.linkText("Download PDF")); // selenium
		downloadelement1.click();
        driver.navigate().back();
		File file1 = new File("C:\\Users\\srina\\Downloads"); // java
		File[] listofFiles1 = file1.listFiles();
		for (File newfiles : listofFiles1) {
			newfiles.getName().equals("testleaf (1)");
			break;
		}
		System.out.println("download PDF is downloaded.");

		File file2 = new File("C:\\Users\\srina\\Downloads"); // java
		File[] listofFiles2 = file2.listFiles();
		WebElement downloadelement2 = driver.findElement(By.linkText("Download Text")); // selenium
		downloadelement2.click();

		for (File newfiles : listofFiles2) {
			newfiles.getName().equals("testleaf (3)");
			break;
		}
		System.out.println("download text is downloaded.");
	}
}
