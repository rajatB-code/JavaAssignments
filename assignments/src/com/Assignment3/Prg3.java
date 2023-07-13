package com.Assignment3;

//Write a Java program to enter length and breadth of a rectangle and find its perimeter.

import java.util.Scanner;

public class Prg3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length & width of the rectangle  :\n");
		float l = sc.nextFloat();
		float w = sc.nextFloat();
		float p;
		
		p = 2 * (l + w );
		
		System.out.println("\n");
		System.out.println("The Parameter of the rectangle =" +p+ " units");
		sc.close();
	}

}
