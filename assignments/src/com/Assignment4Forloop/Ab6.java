package com.Assignment4Forloop;

import java.util.Scanner;

public class Ab6 {
	public static void main(String[] args) {
		
			int N , i , sum =0;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number");
			N = sc.nextInt();
			
			for (  i = 2 ; i <= N ; i++) {
				if ((i%2) == 1) {
					sum = sum +  i;
					
				}
			}
			System.out.println("Sum of all even numbers between 0 to  " + N + 
					" = "  +sum);
			
		}
	}

