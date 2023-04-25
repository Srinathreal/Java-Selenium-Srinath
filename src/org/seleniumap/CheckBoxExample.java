package org.seleniumap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement checkbox1 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div[1]/input"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input"));
		checkbox2.click();
		boolean isselected = checkbox2.isSelected();  //selected or not selected
		System.out.println(isselected);
		//-----------------------------------------------------------------------------------------------
		WebElement checkbox3 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[1]/input"));
		checkbox3.click();
		boolean isselectedA = checkbox3.isSelected();  //selected or not selected
		System.out.println(isselectedA);
		
		//============================================================================================
		
		WebElement checkbox4 = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div[2]/input"));
		checkbox4.click();
		boolean isselectedB = checkbox4.isSelected();  //selected or not selected
		System.out.println(isselectedB);
		
		if (checkbox4.isSelected()) {
			checkbox4.click();        //if selected then click it.
		}
		//--------------------------------------------------------------------------------------------------
		
		
		
		
		
		

	}
}
