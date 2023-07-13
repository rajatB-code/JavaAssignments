package com.Assignment3;

import java.util.Scanner;

public class Prg13 {
	public static void main(String[] args) {
		float SI;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price  :");
		float P = sc.nextFloat();
		System.out.println("Enter the time :");
		float T = sc.nextFloat();
		System.out.println("Enter the rate  :" );
		float R = sc.nextFloat();
				

		SI = (P * T * R) / 100;
		
		System.out.println("Simple Interest " +SI);
		sc.close();
		
		
	}

}
