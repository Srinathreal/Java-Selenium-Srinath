package org.seleniumap;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWIthLinksHyper {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();

		WebElement firstlink = driver.findElement(By.linkText("Go to Home Page"));
		firstlink.click();

		driver.navigate().back();
		WebElement wheretogo = driver.findElement(By.partialLinkText("Find where"));
		
		String where =wheretogo.getAttribute("href");
		System.out.println("this link is going to" + where);

		WebElement verify = driver.findElement(By.linkText("Verify am I broken?"));
		verify.click();
		String verifyme = driver.getTitle();
		if (verifyme.contains("404")) {
			System.out.println("link is broken" + verifyme);
		}

		driver.navigate().back();

		WebElement firstlink1 = driver.findElement(By.linkText("Go to Home Page"));
		firstlink1.click();
		
		driver.navigate().back();
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));

		int linkcount = totallinks.size();
		System.out.println("total links " + linkcount);
		
		//what is stale element reference exception?
		//the element is not attached in the page document.
		
		
	}
}
