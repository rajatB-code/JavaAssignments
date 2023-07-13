package com.Assignment2;

import java.util.Scanner;

public class Prg3ArmstrongNo {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp  = num;
		int rem = 0 ;
		int rev = 0;
		
		while(temp != 0) {
			rem = temp % 10;
			temp = temp / 10;
			rev = rev +(rem * rem * rem);
		}
		System.out.println(rev);
		if ( rev == num) {
			System.out.println("Number is Armstrong no. ");
		}
		else {
			System.out.println("Number is Not Armstrong no. ");
		}
		sc.close();

	}

}
