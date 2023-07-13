package com.Assignment4Forloop;

import java.util.Scanner;

public class Ab8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Digits : ");
		int num = sc.nextInt();
		
		int count = 0 ;
		
		for (;num != 0; num /= 10 , ++count) {
			
		}
			System.out.println("Number of digits : "  +count);
		
	}

}
