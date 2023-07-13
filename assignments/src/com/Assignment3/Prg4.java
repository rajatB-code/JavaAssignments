package com.Assignment3;

//Write a Java program to enter length and breadth of a rectangle and find its area.

import java.util.Scanner;

public class Prg4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length & width of the rectangle  :\n");
		float l = sc.nextFloat();
		float w = sc.nextFloat();
		float a;
		
		a = l * w;
		
		System.out.println("\n");
		System.out.println("The area of the rectangle =" +a+ " units");
		sc.close();
	}
		
}

