package com.Assignment3;

//Write a Java program to convert days into years, weeks 

import java.util.Scanner;

public class Prg9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Days : ");
		int days = sc.nextInt();
		
		int years = days / 365 ;
		int weeks = (days % 365) / 7;
		System.out.println("Number of years : " +years);
		System.out.println("Number of weeks : " +weeks);
		sc.close();
	}

}
