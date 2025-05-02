/**
* File: Lab12Prob02.java
* Class: CSCI 1302
* Author: Raven Crowe
* Created on: Jun 6, 2016
* Last Modified: Aug 16, 2018
* Description: Reverse a string via recursion
* Github: https://github.com/ravencrowe01/GSU_Lab12
*/
public class Lab12Prob02 {
	public static void main (String[] args) {
		System.out.println(reverseString ("Hello world!"));
	}
	
	public static String reverseString (String value) {
		// Return string length 1
		if (value.length() == 1) {
			return value;
		}
		
		// Get the substring
		String sub = value.substring(0, value.length() - 1);
		
		// Return the reversed string
		return value.charAt(value.length () -1) + reverseString (sub);
	}
}
