package org.seleniumap;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*SELENIUM INTERVIEW RELATED
 * Waits in Selenium
 * 1)why do we get exceptions when interacting with web elements?
 * Reasons:
 * 1.The Element we try to interact/find is not at all present in the DOM.
 * 2.Element is present in DOM but not visible.
 * 3.Element is present in DOM but NOT interactable.
 * 
 * 2)what to do in this case?
 * know solution for us: Thread.sleep().
 * 3)why to use Selenium Waits over thread.sleep()?
 * 4)What are selenium waits?
 * 5)Types of waits in selenium --> 
 * IMPLICIT,EXPLICIT,FLUENT
 * 6)Which one is better?
 * pros and cons.
 * 
 * 
 * driver.manage().timeouts().implicitlywait(30,TimeUnit.SECONDS);
 * default wait - 0 sec
 * 
 * driver initialize aanadhula irundhu driver quit aaga varaikum indha 'implicit wait' wait pannum 
 * for all elements performed by driver.
 * 
 * DOM la element iruka ilaiya nu paakkum , if irundha odanae next action will be performed by 'implicit wait'.
 * but it won't check if the element is visible or interactable.(this is major cons of 'implicit wait')
 * 
 * and u can't able to tell 'implicit wait' to wait for such time like that.
 * ex: indha element vandhu visible aagatum adhu varaikum wait panna like that...
 * no condition u can't able to tell to it.
 * 
 * I.W(30); --> 0,0.5,1,1.5,2,2.5,....(polling) poi DOM kitta kettukitae irukum if it got that element
 * then it will perform the action of the element.
 * 
 * after it got that element in time of 2sec then it won't wait like thread.sleep it will immediately
 * take action and save 28 seconds.
 * 
 * for that only, implicit is better.
 * 
 */
public class ImplicitWaitEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); // to wait 30 seconds for full operations.

		driver.navigate().to("https://www.phptravels.net/login");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("user@phptravels.com");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("demouser");

		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		submit.click();

		WebElement profile = driver.findElement(By.xpath("//*[@id='fadein']/div[1]/div/div[3]/ul/li[4]/a"));
		profile.click();

	}

}
