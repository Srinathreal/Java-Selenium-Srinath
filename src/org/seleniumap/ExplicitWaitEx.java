package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*EXPLICIT WAIT :
 *-------------
 * It allows us to command the webdriver to wait until several conditions are met.
 * 
 * How to use:
 * -----------
 * 1.Create WebDriverWait(class) instance(object) ==> driver,seconds
 * 2.wait until(condition to be met)
 * 
 * some conditions:
 * --------------
 * 1.element to be clickable()
 * 2.element to be selected()
 * 3.presence of element located()
 * 4.text to be present in element()
 * 5.alertispresent() and so on.....
 * 
 * how it is better from implicit wait:
 * 
 * (IW) - only checks the presence of element on (DOM)webpage that's all.
 * if elements are hidden or any other condts ,then it won't handle and it will fail the script.
 * 
 * but here, we can handle more predefined conditions.
 * 
 * if there is a netwok issue and if ur application always performs slow, then IW is better.
 * 
 * can we mix implicit/explicit wait together?
 * NO, but we can use but not recommended.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class ExplicitWaitEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // to wait
		// 30 seconds for full operations.

		driver.navigate().to("https://www.phptravels.net/login");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		submit.click();
//------------------------------------------------------------------------------------------------
		// EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement profile = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a")));
		// ExpectedConditions -class [only use class],
		
		// ExpectedConditions -Interface - don't use this!

//---------------------------------------------------------------------------------------------------		
		// WebElement profile =
		// driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a"));
		profile.click();

	}
}
