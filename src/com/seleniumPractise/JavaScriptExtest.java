package com.seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * -------------------
QUESTION 1
-----------
URL : http://www.greenstechnologys.com/
NOTE: Find the font size and color of the line "No 1 Software Training Institutes in Chennai with Placements".
QUESTION 2
-----------
URL : http://www.greenstechnologys.com/
NOTE: Go to down of the webpage using scrolldown and print line "greens over all reviws".
QUESTION 3
-----------
URL : http://toolsqa.com/
NOTE: Go to down of the webpage using scrolldown and again go to top of webpage using scrollup
QUESTION 4
-----------
URL : http://www.greenstechnologys.com/selenium-course-content.html
NOTE: Go to down of webpage using scrolldown and highlight the line "Best Selenium training center in OMR" with Red color.
QUESTION 5
-----------
URL : https://www.facebook.com/
NOTE: Enter the email & password and click login button using JavaScript.
QUESTION 6
-----------
URL : http://www.adactin.com/HotelApp/
NOTE: Enter the username & password and click login button using JavaScript.
QUESTION 7
-----------
URL : https://demoqa.com/registration/
NOTE: Give details and register the form using JavaScript .
QUESTION 8
-----------
URL : https://www.flipkart.com/
NOTE: Enter the email & password and click login button using JavaScript.

 */
public class JavaScriptExtest {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.greenstechnologys.com/");
	driver.findElement(
	By.xpath("No 1 Software Training Institutes in Chennai with Placements"));
	
	
}
}
