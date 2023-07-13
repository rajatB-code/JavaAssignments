package com.Assignment2;

import java.util.Scanner;

public class Prg7SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  digit, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		while(num > 0){
			digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		
		System.out.println("sum of Digits : " +sum  );
		sc.close();

	}


}
