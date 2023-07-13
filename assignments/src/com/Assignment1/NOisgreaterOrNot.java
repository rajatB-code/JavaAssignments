package com.Assignment1;

import java.util.Scanner;

public class NOisgreaterOrNot {
	public static void main(String[] args) {
			
			int num1 , num2;
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the number");
			num1 =sc.nextInt();
			num2 =sc.nextInt();
			
			if ( num1 > num2) {
				System.out.println(num1+  "  is greater");
				
			}
			else {
				System.out.println(num2+  "  is greater");
			}
			sc.close();
      }
}