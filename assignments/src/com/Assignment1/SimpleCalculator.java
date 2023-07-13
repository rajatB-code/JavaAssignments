package com.Assignment1;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		 int a, b, c;
	      int choice;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("1. Addition");
	      System.out.println("2. Subtraction");
	      System.out.println("3. Multiplication");
	      System.out.println("4. Division");
	      System.out.print("Enter Your Choice (1-4): ");
	      choice = sc.nextInt();
	      
	      if(choice>=1 && choice<=4)
	      {
	         System.out.print("\nEnter any Two Number: ");
	         a = sc.nextInt();
	         b = sc.nextInt();
	         
	         if(choice==1)
	            c = a+b;
	         else if(choice==2)
	            c = a-b;
	         else if(choice==3)
	            c = a*b;
	         else
	            c = a/b;
	         
	         System.out.println("\nResult = " +c);
	      }
	      else
	         System.out.println("\nInvalid Choice!");
	      
	      sc.close();
	   } 
	
	
	}


