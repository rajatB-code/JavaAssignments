package com.Assignment1;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		boolean LeapYear ;
		
		LeapYear = (year % 4 == 0);
		
		LeapYear = LeapYear &&(year % 100 != 0 || year % 400 == 0);
		
		
		if(LeapYear) {
			System.out.println(year+ " is a leap year");
		}
		else {
			System.out.println(year+ " is  not a leap year");
		}
		sc.close();
	}

}
