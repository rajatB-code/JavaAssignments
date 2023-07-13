package com.Assignment3;

//Write a Java program to enter length in centimeter and convert it into meter and kilometer.

import java.util.Scanner;

public class Prg6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length in centimeter : \n");
		float c= sc.nextFloat();
		float  m;
		float k;
		
		m = (float)(c / 100);
		k = (float)(c / 10000);
		
		System.out.println("Length in meter =" +m+ " meter");
		System.out.println("length in kilometer = " +k+ "kilometer");
		sc.close();
		
	}

}
