package com.Assignment2;

public class Prg5FibbonaciS {
	public static void main(String[] args) {
		
		int i = 1 , n = 10 ,temp1 = 0 , temp2 = 1,temp3 ;
		
		System.out.println("Fibbonacci Series till " + n + "terms :");
		
		while(i <= n) {
			System.out.print(temp1 + ", " );
			
			temp3 = temp1 + temp2;
			temp1 = temp2;
			temp2 = temp3;
			
			i++;
		}
	}

}
