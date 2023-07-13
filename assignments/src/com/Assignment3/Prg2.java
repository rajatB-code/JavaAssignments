package com.Assignment3;

//Write a Java program to enter two numbers and perform all arithmetic operations.
import java.util.Scanner;

public class Prg2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the The Num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the the num2 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2 ;
		int sub = num1 - num2 ;
		int quotient  = num1 / num2 ;
		int multi = num1 * num2 ;
		int modulo = num1 % num2;
		
		System.out.println("sum  : " +sum);
		System.out.println("sub  : " +sub);
		System.out.println("quotient :" +quotient);
		System.out.println("multi  :" +multi);
		System.out.println("modulo  :" +modulo);
		sc.close();

	}
	

}
