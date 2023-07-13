package com.Assignment4Forloop;

import java.util.Scanner;

public class Ab10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number : ");
		int num = sc.nextInt();
		
		int m = num;
		int sum =0;
		while( num!= 0) {
			int d = num % 10;
			int fact = 1;
			for ( int i = 1; i<= d; i++)
				fact = fact *i;
			sum =sum + fact;
			num  = num/ 10;
			
		}
		if (sum == m)
			System.out.println(" yes ");
		else
			System.out.println(" No ");
		sc.close();
	}

}
