package com.Assignment3;

import java.util.Scanner;

public class Prg1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two number :");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int num3 = num1 + num2 ;
		
		System.out.println("Addtion "  +num3);
		
		sc.close();
		}

}
