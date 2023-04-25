package org.seleniumap2;
//SELENIUM EXCEPTIONS:

//Execption--> a sudden way of stoping u r program.

public class ExceptionsEx {

	/*
	 1. org.openqa.WebDriverException -->[ PARENT EXCEPTION ]
	 * 
	 * 
	 2. org.openqa.NoSuchElementException 
	 * 
	 * (if that findable Element is not present there, then this Exception will appear.)
	 * --------------------------------------------------------------------------------------
	 3. org.openqa.StaleElementReferenceException
	 * 
	 * [Stale-->dry (meaning),no longerfresh (meaning)]
	 * 
	 * (After we find element in one page, then vera oru page ku poitu then return to that first page in that case
	 * that element will dry and throws  StaleElementReferenceException)
	 * 
	 * so, we have find again to that element.
	 * 
	 * (oruthadava find pannitu thirumba thirumba [operation] adha again use panna mudiyadhu)
	 *---------------------------------------------------------------------------------------- 
	 4. org.openqa.UnhandledAlertException
	 * 
	 * (vara ALert ah handle pannama vera oru operation panna , then UnhandledAlertException happens.)
	 * 
	 * ----------------------------------------------------------------------------------------
	 5. org.openqa.InvalidElementStateException[Grandparent]  (for tesxtbox.clear() operation)
	 * 
	 * (Hidden elements)
	 * 
	 * 1.ElementNotInteractableException(child1)
	 * 2.ElementNotSelectableException(child2)
	 * 
	   org.openqa.ElementNotVisibleException [Child of Child1] (for textBox.sendKeys() operation)
	 * 
	 * (Hidden elements)
	 * 
	 * -----------------------------------------------------------------------------------------
	 * 
	 6. org.openqa.NoSuchFrameException
	 * 
	 * (illadha oru Frame ku poga sonna indha Exception varum)
	 * 
	 * --------------------------------------------------------------------------------------------
	 7. org.openqa.NoSuchSessionException
	 * 
	 * (When u r trying performing any operation using the driver, once driver.quit() is called!)
	 * 
	 * Ex:
	 * driver.quit();
	 * driver.findElement(By.name("q");
	 * 
	 * (any action after u quit the browser)
	 * -------------------------------------------------------------------------------------------
	 8. org.openqa.SessionNotCreatedException
	 * 
	 * (when browser killed before the runs)
	 * 
	 * ---------------------------------------------------------------------------------------------
	 * 
	 9. org.openqa.UnreachableBrowserException
	 * 
	 * The provided server address to RemoteWebDriver is Invalid , so the conncetion could not be
	 * established. Browser died in between. version incompoatibility.
	 * 
	 * -------------------------------------------------------------------------------------------
	 * 
	 10. org.openqa.NoSuchWindowException
	 * 
	 * (illadha oru window ku switch panna sonna this exception will occur)
	 * ---------------------------------------------------------------------------------------
	 11. org.openqa.ElementNotInteractableException
	 * 
	 * (other element may get that click)
	 * ----------------------------------------------------------------------------------
	 12. org.openqa.TimeOutException
	 * 
	 13. JavascripException --> regarding Javascript 
	 */
	
	
	
	
}
