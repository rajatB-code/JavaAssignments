package com.Assignment2;

import java.util.Scanner;

public class Prg6MaximumNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		int largest_Digit = 0;
		
		while(num >0) {
			int n = num % 10 ;
			if(largest_Digit < n) {
				largest_Digit = n;
			}
			num = num / 10  ;
		}
		System.out.println("LARGEST Digits : "  +largest_Digit);
		sc.close();
	}

}
