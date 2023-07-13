package com.Assignment2;

public class Prg5copy {
	public static void main(String[] args) {
		int num=10;
		int temp1 = 0 , temp2 = 1 , temp3;
		System.out.print(" " +temp1);
		System.out.print(" " +temp2);
		
		for(int i= 1 ; i<num ; i++) {
			temp3 = temp1 + temp2 ;
			System.out.print("  " +temp3);
			temp1 = temp2;
			temp2 = temp3;
		}
	}

}
