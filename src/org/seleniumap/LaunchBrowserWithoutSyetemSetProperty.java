package org.seleniumap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Launch a browser Without System.setProperty()
 * ---------------------------------------------
 * 1.Is it possible? Yes/No
 * 2.If Yes, then how?
 * 
 * 
 * Yes , we can....Launch a browser Without System.setProperty() by adding location path
 * in (without chromedriver.exe) environmental variables,
 * In system variables change path for entire system use semi colon and save
 * and restart your system..
 *
 * Note:   
 * =============================================
 * System.setProperty() vellai enna na environmental variables la normal namma add pannra
 * indha vellaiya temporary ah indha code run aaguradhuku idhu pannudhu.
 * 
 * if we add this permanentely in environmental variables ,then these 2 lines no needed.
 * 	[System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");]
				
 */
public class LaunchBrowserWithoutSyetemSetProperty {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
	}
}
