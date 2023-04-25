package com.seleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * QUESTIONS(Practical)
--------------------
QUESTION 1
----------
URL : http://toolsqa.com/handling-alerts-using-selenium-webdriver/

NOTE: Perform all alert.

QUESTION 2
----------
URL : https://www.lvbank.com/search.aspx?zoom_query=

NOTE: Click submit without enter the values and perform alert.

QUESTION 3
----------
URL : https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997

NOTE: Click submit without enter the user id.

QUESTION 4
----------
URL : https://netbanking.canarabank.in/entry/ENULogin.jsp

NOTE: Click submit without enter the user id.

QUESTION 5
----------
URL : https://retail.onlinesbi.com/retail/login.htm

NOTE: Click submit without enter the user id.

QUESTION 6
----------
URL : https://www.sprint.com/

NOTE: Click submit without enter the user id.

QUESTION 7
----------
URL : https://paytm.com/

NOTE: click login.Enter the username and password.

QUESTION 8
----------
URL : https://netbanking.hdfcbank.com/netbanking/

NOTE: Enter the userId,click continue.Enter password.

QUESTION 9
----------
URL : https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI
NOTE: Enter the userId,Enter password.
 */
public class AlertsExTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
	//	driver.get("https://www.lvbank.com/search.aspx?zoom_query=");
		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
//		driver.manage().window().maximize();
//		
//		WebElement findElement = driver.findElement(By.linkText("CONTINUE"));
//		findElement.click();
		
//		
//		Actions actions = new Actions(driver);
//		actions.click().perform();
//		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//-----------------------------------------------------------------------------------		
//		driver.get("https://retail.onlinesbi.com/retail/login.htm");
//		driver.manage().window().maximize();
//		WebElement findElement = driver.findElement(By.linkText(""));
//		findElement.click();
//		driver.close();
		
//-----------------------------------------------------------------------------------		
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		
		
	}
	
	
}
