package com.Assignment3;

import java.util.Scanner;

public class Prg12 {
	public static void main(String[] args) {
		double total , average , percentage ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of english  : " );
		float eng = sc.nextFloat();
		System.out.println("Enter the marks of maths : ");
		float math = sc.nextFloat();
		System.out.println("Enter the marks of science : ");
		float sci = sc.nextFloat();
		System.out.println("Enter the marks of chem ");
		float chem = sc.nextFloat();
		System.out.println("Enter the marks of Computer");
		float com = sc.nextFloat();
		
		total = eng + math + sci + chem + com ;
		average = (total / 5.0);
		percentage = (total / 500.0) * 100;
		
		System.out.println("Total Marks : " +total);
		System.out.println("Average of Marks : " +average);
		System.out.println("Percentage of Marks : " +percentage );
		
		sc.close();
	}

}
