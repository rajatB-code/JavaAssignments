package com.Assignment4Forloop;

import java.util.Scanner;

public class Ab12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int r , sum = 0, temp;
		
		temp=num;
		
		while(num > 0) {
			r = num % 10 ;
			sum = (sum * 10 )+ r;
			num = num /10;
			
		}
		if(temp == sum)
			System.out.println("Palindrome number : ");
		else
			System.out.println(" Not Palindrome number  :");
	
	}	
}
		


