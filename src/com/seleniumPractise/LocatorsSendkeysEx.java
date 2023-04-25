package com.seleniumPractise;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * QUESTIONS(Practical) 
 * -------------------- 
 * QUESTION 1 
 * ---------- 
 * URL :
 * https://www.facebook.com/
 * 
 * NOTE: Enter Email or Phone and Password.
 * 
 * QUESTION 2 ---------- 
 * URL : https://www.redbus.in/
 * 
 * NOTE: NOTE: Enter from and to textbox.
 * 
 * QUESTION 3 ----------
 * URL : https://www.google.com/
 * 
 * NOTE: Enter GreensTechnology.
 * 
 * QUESTION 4 ---------- URL :
 * https://www.lvbankonline.in/lvbretail/RetailLogin.html
 * 
 * NOTE: Enter username and password.
 * 
 * QUESTION 5 ---------- URL : 
 * https://infinity.icicibank.com/corp/Login.jsp
 * 
 * NOTE: Enter username and password.
 * 
 * QUESTION 6 ---------- 
 * URL : https://twitter.com/login
 * 
 * NOTE: Enter username and password.
 * 
 * QUESTION 7 ---------- 
 * URL : https://netbanking.hdfcbank.com/
 * 
 * NOTE: Enter custom id .
 * 
 * QUESTION 8 ---------- 
 * URL: https://www.swiggy.com
 * 
 * NOTE: Enter the location.
 * 
 * QUESTION 9 ---------- 
 * URL :https://www.snapdeal.com/login
 * 
 * NOTE: Enter mobile number/email.
 * 
 * QUESTION 10 ----------- 
 * URL :
 * https://www.instagram.com/accounts/login/?hl=en) login page
 * 
 * NOTE: Enter username and password.
 * 
 * QUESTION 11 ----------- 
 * URL: https://www.irctc.co.in/
 * 
 * NOTE: Just enter the values for the textbox only.
 * 
 * QUESTION 12 ----------- 
 * URL: www.adactin.com/HotelApp/
 * 
 * NOTE: Enter Email or Phone and Password.
 * 
 * 
 */
public class LocatorsSendkeysEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", //if its wrongly typed its states-->"IllegalStateException"
				
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//#1TASK		NOTE: Enter Email or Phone and Password.
//		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		WebElement username = driver.findElement(By.id("email"));
//
//		username.sendKeys("Srinath");
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("uijkhju");
//		driver.close();
//--------------------------------------------------------------------------------------------		

//#2TASK		Enter from and to textbox.
		
//		driver.get("https://www.redbus.in/");
//		driver.manage().window().maximize();
//		WebElement from = driver.findElement(By.id("src"));
//		from.sendKeys("Chennai");
//		WebElement to = driver.findElement(By.id("dest"));
//		to.sendKeys("Bangalore");
		
//--------------------------------------------------------------------------------------------		
//#3TASK    		Enter GreensTechnology.
//		
//		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
//		WebElement search = driver.findElement(By.name("q"));
//		search.sendKeys("GreensTechnology");
		
//--------------------------------------------------------------------------------------------		
//#4TASK         Enter username and password.     		
//		
//		driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
//		driver.manage().window().maximize();
//		WebElement username = driver.findElement(By.name("username"));
//		username.sendKeys("Srinath");
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("riya");
		
//--------------------------------------------------------------------------------------------		
//#5TASK       Enter username and password
		
//		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
//		driver.manage().window().maximize();
//		WebElement name = driver.findElement(By.name("username"));
//		name.sendKeys("Srinath");
//		WebElement pass = driver.findElement(By.name("password"));
//		pass.sendKeys("riya");
		
		//NoSuchElementException here, 
		
//--------------------------------------------------------------------------------------------		
//#6TASK		Enter username and password.
		
//		driver.get("https://twitter.com/login");
//		driver.manage().window().maximize();
//		WebElement name = driver.findElement(By.name("text"));
//		name.sendKeys("Srinath");
//		WebElement pass = driver.findElement(By.name("password"));
//		pass.sendKeys("hvkb");
		
//--------------------------------------------------------------------------------------------		
//#7TASK          Enter custom id 
		
//		driver.get("https://netbanking.hdfcbank.com/");
//		driver.manage().window().maximize();
//		WebElement name = driver.findElement(By.name("fldLoginUserId"));
//		
//		//if wrong element --> NoSuchElementException
//		
//		name.sendKeys("Srinath");
		
//--------------------------------------------------------------------------------------------		
//#8TASK		Enter the location.
		
//		driver.get("https://www.swiggy.com");
//		driver.manage().window().maximize();
//		WebElement location = driver.findElement(By.id("location"));
//		location.sendKeys("Chennai");
//		driver.close();
//		
//--------------------------------------------------------------------------------------------		
//#9TASK	Enter mobile number/email.
		
//		driver.get("https://www.snapdeal.com/login");
//		driver.manage().window().maximize();
//		WebElement mobile = driver.findElement(By.id("userName"));
//		mobile.sendKeys("988700979");
//		driver.close();
//--------------------------------------------------------------------------------------------		
//#10TASK		Enter username and password.
		
//		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
//		driver.manage().window().maximize();
//		WebElement user = driver.findElement(By.name("username"));
//		user.sendKeys("gfiug");
		
//--------------------------------------------------------------------------------------------		
//#11TASK		
//		driver.get("https://www.irctc.co.in/");
//		driver.manage().window().maximize();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		
		//if no alert --> NoAlertPresentException
		
//--------------------------------------------------------------------------------------------		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Srinath7");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("890Adactin");
	
//--------------------------------------------------------------------------------------------		
		
	}
}
