package org.seleniumap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * 
 * Write a program to insert a student rollNumber as a key and studentName as a value using HashMap and print it.
Input :rollNumber=101,102,103
studentName=siva,arun,raja
Output:[101=siva,102=arun,103=raja]


Write a program to iterate the keys and values using enhanced for loop and normal for loop from HashTable
 */
public class MapEx {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		// To insert an element 'PUT' method is used.

		map.put(101, "siva");
		map.put(102, "arun");
		map.put(103, "raja");

		System.out.println(map);
		
//-------------------------------------------------------------------------------------------		
//important iteration for Map using Foreach!  1method
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
//--------------------------------------------------------------------------------------------		
		//2nd method
		for (Integer rollnum : map.keySet()) {
			System.out.println(rollnum);
		}		
		for (String Name : map.values()) {
			System.out.println(Name);
		}
//-------------------------------------------------------------------------------
		
		//Using Iterators:
		
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
		
//------------------------------------------------------------------------------------	
		//3rd method:
		map.forEach((k,v) -> System.out.println("key = "+k +"value = "+v));

		
	}

}
