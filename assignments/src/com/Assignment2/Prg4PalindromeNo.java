package com.Assignment2;

import java.util.Scanner;

public class Prg4PalindromeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0 ;
		int rem = 0;
		
		while( temp != 0) {
			rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}
		if(sum == num) {
			System.out.println(num+ " is a Palindrome Number");
		}
		else {
			System.out.println(num+ " is not a Palindrome Number");
		}
		sc.close();
	}

}
