package com.seleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * QUESTION 1
-----------
URL : http://www.greenstechnologys.com/

NOTE: Click Contact us. Give the details for submit your enquiry form.

QUESTION 2
-----------
URL : https://www.facebook.com/

NOTE: Enter email and password and click login(by using xpath locator).

QUESTION 3
-----------
URL : https://demo.automationtesting.in/register.html

NOTE: Give details and register the form.

QUESTION 4
-----------
URL : https://toolsqa.com/automation practice-form

NOTE: Give details and register the form.

QUESTION 5
-----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Click cts interview question.

QUESTION 6
----------
URL : https://www.redbus.in/

NOTE: Click signin/signup and again Click signin and register the form.

QUESTION 7
----------
URL : https://www.cleartrip.com/trains

NOTE: Give details and register the form.

QUESTION 8
-----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Click core java materials.

QUESTION 9
-----------
URL : https://www.flipkart.com/

NOTE: Click signup and Give details and register the form.

QUESTION 10
-----------
URL : https://www.amazon.in/

NOTE: Click sign in and click create your amazon account and give details and register the form.

QUESTION 11
-----------
URL : https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp

NOTE: Give details and register the form.

QUESTION 12
-----------
URL : https://www.irctc.co.in/nget/train-search

NOTE: Click register and Give details and register the form.

QUESTION 13
-----------
URL : https://www.snapdeal.com/

NOTE: Click signin and click new register and enter mobile number abd click continue.

QUESTION 14
-----------
URL : https://www.myntra.com/register?referer=https://www.myntra.com/

NOTE: Give details and register the form.

QUESTION 15
-----------
URL : https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html

NOTE: Enter the username,password and click the checkbox and press login.

QUESTION 16
-----------
URL : https://www.swiggy.com/

NOTE: Click sign up and Give details and register the for
 */
public class XpathEx {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://www.greenstechnologys.com/");
//		driver.manage().window().maximize();
//		WebElement clickus = driver.findElement(By.linkText("CONTACT US"));
//		clickus.click();
		
//-------------------------------------------------------------------------------------------		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
//		user.sendKeys("srinath");
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("kahbkb");
//		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
//		click.click();
//		
//-------------------------------------------------------------------------------------------		
		
//		driver.get("https://demo.automationtesting.in/register.html");
//		driver.manage().window().maximize();
//		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
//		user.sendKeys("srinath");
//		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
//		pass.sendKeys("kahbkb");
//		WebElement click = driver.findElement(By.xpath("//button[@name='login']"));
//		click.click();
	
		
//-------------------------------------------------------------------------------------------		
//		driver.get("https://toolsqa.com/automation practice-form");
//		driver.manage().window().maximize();
		
		
//-------------------------------------------------------------------------------------------		
//		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
//		driver.manage().window().maximize();
//		
//		WebElement link = driver.findElement(By.linkText("CTS INTERVIEW QUESTIONS"));
//		//to get particular position
//		JavascriptExecutor executor= (JavascriptExecutor) driver;
//		executor.executeScript("arguments[0].scrollIntoView(true);",link);
//		
//		link.click();
//-------------------------------------------------------------------------------------------		
//#d	
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement sign = driver.findElement(By.xpath("//div[@id='select_box_sign']"));
           sign.click();
           
       
//-------------------------------------------------------------------------------------------		
		
	}
}
