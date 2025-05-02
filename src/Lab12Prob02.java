/**
* File: Lab12Prob01.java
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
		if (value.length() == 1) {
			return value;
		}
		
		String sub = value.substring(0, value.length() - 1);
		
		return value.charAt(value.length () -1) + reverseString (sub);
	}
}
