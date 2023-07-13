package com.Assignment3;

//Write a Java program to enter radius of a circle and find its diameter, circumference and area.

import java.util.Scanner;

public class Prg5 {
	public static void main(String[] args) {
		double diameter, circumference, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		double radius = sc.nextDouble();
		
		diameter = 2 * radius ;
		circumference = 2 * 3.14 * radius ;
		area = 3.14 * (radius * radius);
		
		System.out.println("Diameter of Circle :  " +diameter+ "units");
		System.out.println("circumference of Circle :  " +circumference+ "units");
		System.out.println("area of Circle :  " +area+ "units");
		sc.close();
		
	}

}
