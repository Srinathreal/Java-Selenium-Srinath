package org.seleniumap;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithImages {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();
	
//		WebElement first = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/img"));
//	first.click();
//	
	WebElement second = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
	//to find if a img is broken or not we use to verify its'naturalwidth'(attribute) is equals to 0.
	//if it is 0 - broken img else it nor a broken img.
	if (second.getAttribute("naturalWidth").equals("0")) {
		System.out.println("the img is broken");
	}
		else {
			System.out.println("the img is not broken");
		}
	}
	
	
	
	
	
	
	
	
	}

