/**
* File: Lab12Prob03.java
* Class: CSCI 1302
* Author: Raven Crowe
* Created on: Jun 6, 2016
* Last Modified: Aug 16, 2018
* Description: Reverse a string via recursion
* Github: https://github.com/ravencrowe01/GSU_Lab12
*/
public class Lab12Prob03 {
	public static void main (String[] args) {
		var str = "Hello world!";
		System.out.println(reverseString (str));
	}
	
	public static String reverseString (String value) {
		// Call helper method
		return reverseString (value, value.length ());
	}
	
	public static String reverseString (String value, int index) {
		// Only one character left.
		if (index == 1) {
			return String.valueOf(value.charAt(index - 1));
		}
		
		// Return the reversed string
		return value.charAt(index - 1) + reverseString (value, index - 1);
	}
}
