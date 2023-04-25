package seleniumhandsOn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Driver new/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		username.sendKeys("Srinath");
		password.sendKeys("YC186");
		driver.findElement(By.id("login")).click();
		boolean displayed = driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[5]/td[2]/div/b"))
				.isDisplayed();
		System.out.println(displayed);
		driver.close();
//		String attribute = driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
//		System.out.println(attribute);
//
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//
//		if (currentUrl.equals("https://adactinhotelapp.com/SearchHotel.php")) {
//			System.out.println("u r in adactin web page");
//		} else {
//			System.out.println(" u r not in adactin webpage");
//		}

	}

}