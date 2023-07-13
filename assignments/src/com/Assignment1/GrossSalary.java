package com.Assignment1;

import java.util.Scanner;

public class GrossSalary {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Basic salary : ");
		int bs = sc.nextInt();
		float hra , da , total;
		if (bs <= 1000) {
			hra = bs * 0.2f;
			da = bs * 0.8f;
		}
		else if(bs <=2000) {
			hra = bs *0.25f;
			da = bs * 0.9f;
		}
		else
		{
			hra = bs * 0.3f;
			da = bs * 0.9f;
		}
		System.out.println("Gross salary : " +(bs + hra + da) );
	}
}
