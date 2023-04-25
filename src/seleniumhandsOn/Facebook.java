package seleniumhandsOn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean displayed = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if (displayed == true) {
			System.out.println("logo dispalyed");
		} else {
			System.out.println("logo NOT dispalyed");

		}
		

		WebElement findElement = driver.findElement(By.xpath("(//*[@role='button'])[2]"));

		findElement.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("srinath");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("098776");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("098776");

		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

	}
}
