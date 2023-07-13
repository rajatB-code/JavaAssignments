package com.Assignment1;



public class MaximumNo2 {
	public static void main(String[] args) {
		
		int num1 = 58 , num2 = 86, num3= 110;
		
		
		if(num1 >= num2) 
		{
			if(num1 >= num3)
			System.out.println("The Maximum number is:  "  +num1);
			else
		    System.out.println("The Maximum number is:  "  +num3);
		}
		else {
			if(num2 >= num3) {
			System.out.println("The Maximum number is:  "  +num2);
		}
		else {
			System.out.println("The Maximum number is: "   +num3);
		}
		
	}
}
}
