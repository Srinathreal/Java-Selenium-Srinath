package org.seleniumap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srina\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();

		// very very veryyyyy important -- TABLES

		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int columncount = columns.size();
		System.out.println("column size is " + columncount);

		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowcount = row.size();
		System.out.println("row size is " + rowcount);

		WebElement getpercent = driver
				.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));

		// normalize-space() is used to cut excess space.
		// following::td[1] is next data folowed by data1 learn to interact with
		// elements
		// by this method also we can use xpath to get that element .

		String percent = getpercent.getText();
		System.out.println("percentage is " + percent); // percentage

		List<WebElement> allprogress = driver.findElements(By.xpath("//td[2]"));

		List<Integer> numberlist = new ArrayList<Integer>();

		for (WebElement webElement : allprogress) {
			String individualvalue = webElement.getText().replace("%", ""); // replace % to ''

			numberlist.add(Integer.parseInt(individualvalue)); // to change strings to number(integer).

		}
		System.out.println("final list" + numberlist);

		int smallvalue = Collections.min(numberlist); // to get min value .
		System.out.println(smallvalue);

//		String smallvaluestring = Integer.toString(smallvalue) + "%";
//
//		String finalxpath = "//td[normalize-space()=" + "\"" + smallvaluestring + "\"" + "]" + "//following::td[1]";
//		// first we have to change int(smallvalue) to string(smallvaluestring)
//		// then we find xpath in that we add this string by "\"" ,"\"", and by using
//		// '+'.
//		System.out.println(finalxpath);
//		// final xpath

		WebElement finalcheckclick = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));

		finalcheckclick.click();

	}
}
