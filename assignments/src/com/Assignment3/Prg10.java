package com.Assignment3;

//Write a Java program to enter base and height of a triangle and find its area.

import java.util.Scanner;

public class Prg10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base & Heigth of a triangle : ");
		float b = sc.nextFloat();
		float h = sc.nextFloat();
		float a;
		
		a = (float ) ((b * h ) / 2);
		
		System.out.println("\n Area of triangle ="  +a+ "sq.units");
		
		sc.close();
		
	}

}
