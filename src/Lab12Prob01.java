/**
* File: Lab12Prob01.java
* Class: CSCI 1302
* Author: Raven Crowe
* Created on: Jun 6, 2016
* Last Modified: Aug 16, 2018
* Description: Test a recursive method
* Github: https://github.com/ravencrowe01/GSU_Lab12
*/
public class Lab12Prob01 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i ++) {
			System.out.println(recursiveAbstract (i));
		}
	}
	
	public static int recursiveAbstract (int number) {
		// Base cases
		if (number == 0) {
			return 1;
		}
		
		if (number == 1) {
			return 3;
		}
		
		if (number == 2) {
			return 4;
		}
		
		// Do the function's maths
		return recursiveAbstract(number - 3) * (recursiveAbstract(number - 2)- recursiveAbstract (number - 1));
	}
}
