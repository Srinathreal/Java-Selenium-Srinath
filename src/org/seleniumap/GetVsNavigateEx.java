package org.seleniumap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVsNavigateEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	//	driver.get("http://www.google.co.in");
		driver.navigate().to("http://www.google.co.in");
		driver.manage().window().maximize();
	
		
		/*
		 * Differnence btw get() nd navigate().to()
		 * ------------------------------------------
		 * .get() WILL NOT STORE HISTORY!
		 * 
		 * BUT,
		 * 
		 * .navigate().to() WILL STORE HISTORY!
		 * 
		 * by this, we go back,forward,refresh...
		 * 
		 * 
		   driver.navigate().back();
		   driver.navigate().forward();
		   driver.navigate().refresh();
		 * --------------------------------------------
		 * another diff..,
		 * get() --> will wait for DOM appear 
		 * (ellam elements um DOM la appear aagura varaikum wait pannum)
		 * 
		 * but,
		 * navigate().to()--> doesn't wait like that
		 * ---------------------------------------------
		 *orae idhula multiple methods use panna --> METHOD CHAINING
		 * EX: navigate().to()  ...(TWO METHODS IN SAME LINE)
		 */
		
		
	}
}
