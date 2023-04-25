package com.seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * QUESTION 1
----------
URL : http://demo.guru99.com/test/drag_drop.html

NOTE: Drag bank ,5000 in debited side and drop sales,5000 in credited side

QUESTION 2
-----------
URL: http://www.amazon.in

NOTE: Shop by categorey is first mouseover
Mobile and accessories is second mouseover
Click powerbank

QUESTION 3
----------
URL : http://www.flipkart.com

NOTE: Home&appliances is first mouseover
Click any chair and add it to cart.

QUESTION 4
----------
URL : https://www.gettyimages.in/

NOTE: Editorial mouseover
Click entertainment.

QUESTION 5
----------
URL : https://www.shopclues.com/wholesale.html

NOTE: Mobile and electronics is first mouseover and click range Rs5001 - Rs10000

QUESTION 6
----------
URL : https://www.shopclues.com/wholesale.html

NOTE: Sports&more is first mouseover
Click weights grainers
Click first item to add to cart
Print the cost in cart


QUESTION 7
----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Course is first mouseover
Software training is second mouseo ver
Click selenium training and print 3rd paragraph.

QUESTION 8
-----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Courses is first mouseover
Oracle training is second mouseover
Click Oracle sql training and print 1st line.

QUESTION 9
----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Courses is first mouseover
DataWarehouse training is second mouse over
click microstategy training.

QUESTION 10
-----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Courses is first mouseover
WebDesigning training is second mouseover
Click javascript training.

QUESTION 11
-----------
URL : http://www.greenstechnologys.com/selenium-course-content.html

NOTE: Courses is first mouseover
SAP training is second mouseover
Click SAP MM training & print 1st paragraph

QUESTION 12
-----------
URL : https://www.homedepot.com/

NOTE: Alldepartment is first mouseover
Heating and cooling is second mouseover
Air conditioners is third mouseover
Click portable air conditioners.

QUESTION 13
-----------
URL : https://www.homedepot.com/

NOTE: All department is first mouseover
Paint is second mouseover
Interior painting is third mouseover
Click celling paint.

QUESTION 14
-----------
URL : https://www.snapdeal.com/

NOTE: Mobile & Tablets is first mouseover
Click newly lanuch covers.

QUESTION 15
-----------
URL : https://www.snapdeal.com/

NOTE: Women's Fashion is first mouseover
Click footwear->click heals.

QUESTION 16
-----------
URL : https://www.amazon.in/

NOTE: Signin is first mouseover
Click start here
Give details for signup.

QUESTION 17
-----------
URL : https://www.amazon.in

NOTE: Shop by categeory is first mouseover
Men's fashion & click sun glasses.

QUESTON 18
----------
URL : https://www.amazon.in/

NOTE: Click start here
Click give already have account
Enter email and password and click login.

QUESTION 19
-----------
URL : https://www.flipkart.com/

NOTE: womens is mouseover
Click footwear
Click flat slipper

QUESTION 20
-----------
URL : https://www.sprint.com/

NOTE: My sprint is first mouseover
Click Paybill.

QUESTION 21
------------
URL : https://www.sprint.com/

NOTE: shop is first mouseover
Click unlimited.
 */
public class ActionsExTest {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//	driver.get("http://demo.guru99.com/test/drag_drop.html");
//	driver.manage().window().maximize();
//	
//	WebElement fromelement = driver.findElement(By.linkText("BANK"));
//	WebElement toelement = driver.findElement(By.xpath("(//*[@class='placeholder'])[1]"));
//	
		Actions actions = new Actions(driver); // for DRAGANDDROP
//	actions.dragAndDrop(fromelement, toelement);
//	actions.build().perform();
//	
//	WebElement fromelement1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//	
//	WebElement toelement1 = driver.findElement(By.id("amt7"));
//	
//	
//	actions.dragAndDrop(fromelement1, toelement1);
//	actions.build().perform();
//	
//	WebElement fromelement2 = driver.findElement(By.id("credit1"));
//	WebElement toelement2 = driver.findElement(By.id("loan"));
//	
//	actions.dragAndDrop(fromelement2, toelement2);
//	actions.build().perform();
//	
//	WebElement fromelement3 = driver.findElement(By.id("fourth"));
//	WebElement toelement3 = driver.findElement(By.id("amt8"));
//	
//	actions.dragAndDrop(fromelement3, toelement3);
//	actions.build().perform();

//---------------------------------------------------------------------------------------------	
		/*
		 * NOTE: Shop by categorey is first mouseover Mobile and accessories is second
		 * mouseover Click powerbank
		 */

//		driver.get("http://www.amazon.in");
//		driver.manage().window().maximize();
//		WebElement searchbar = driver.findElement(By.id("searchDropdownBox"));
//		searchbar.click();
//
//		// autocompilation [ul]
//		List<WebElement> electronics = driver.findElements(By.xpath("//option[@value='search-alias=electronics']"));
//
//		for (WebElement webElement : electronics) {
//			if (webElement.getText().equals("Electronics")) {
//				webElement.click();
//				break;
//			}
//		}
//		WebElement clicksearch = driver.findElement(By.id("nav-search-submit-button"));
//		clicksearch.click();
//
//		WebElement mobileaccessories = driver.findElement(By.linkText("Mobiles & Accessories"));
//		actions.moveToElement(mobileaccessories).click().build().perform();
//
//		WebElement mobile = driver.findElement(By.linkText("Mobile Accessories"));
//		actions.moveToElement(mobile).click().build().perform();
//		WebElement charger = driver.findElement(By.linkText("Chargers"));
//		actions.moveToElement(charger).click().build().perform();
//		WebElement powerbank = driver.findElement(By.linkText("Power Banks"));
//		actions.moveToElement(powerbank).click().build().perform();
//
//		driver.quit();

//---------------------------------------------------------------------------------------------
		/*
		 * NOTE: Home&appliances is first mouseover Click any chair and add it to cart.
		 */
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		WebElement ad = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		actions.moveToElement(ad).click().build().perform();

		WebElement home = driver.findElement(By.linkText("Home"));
		actions.moveToElement(home).build().perform();

		WebElement room = driver.findElement(By.linkText("Living Room"));
		actions.moveToElement(room).build().perform();

		WebElement all = driver.findElement(By.linkText("All"));
		actions.moveToElement(all).click().build().perform();

		WebElement bed = driver.findElement(By.xpath("(//div[@class='CXW8mj _21_khk'])[3]"));
		actions.moveToElement(bed).click().build().perform();

		
		WebElement cart = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		cart.click();

	}

}
