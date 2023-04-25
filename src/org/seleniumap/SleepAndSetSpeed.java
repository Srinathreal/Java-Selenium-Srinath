package org.seleniumap;
/*
 * Difference between Thread.sleep() and selenium.setSpeed()
 * ---------------------------------------------------------
 * Normal Way:
 * Operation 1
 * Operation 2
 * Operation 3
 * 
 * Thread.sleep()
 * --------------
 * Thread.sleep(2000);
 * Operation 1
 * Thread.sleep(2000);
 * Operation 2
 * Thread.sleep(2000);
 * Operation 3
 * 
 * 
 * NOTE: In earlier version, setSpeed is there , but now its gone(Depricated)
 * Selenium.setSpeed()
 * -------------------
 * selenium.setspeed("2000");
 * 
 * Operation 1
 * Operation 2
 * Operation 3
 * 
 * --------------------------------------------------------------------
 * 
 * 
 * 
 */
public class SleepAndSetSpeed {

}
