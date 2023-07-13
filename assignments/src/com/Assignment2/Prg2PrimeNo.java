package com.Assignment2;

import java.util.Scanner;

public class Prg2PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		
		int i = 2 , count = 0;
		while (i <= num / 2) 
		{
			if(num % i == 0) {
			count++;
			break;
		}
		i++;
	}
	if(count == 0){
		System.out.println(num+ " : is Prime Number " );
		}
	else {
		System.out.println(num+ " : is not a prime number");
		
	}
	sc.close();
  }
}
