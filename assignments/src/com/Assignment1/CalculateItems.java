package com.Assignment1;

import java.util.Scanner;

public class CalculateItems {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the items ");
		String items = sc.next();
		System.out.println("Enter the quntity : ");
		int quntity = sc.nextInt();
		System.out.println("Enter the price : ");
		int price = sc.nextInt();
		int bill = quntity * price;
		
		System.out.println("price of " +items+ "Is " +bill+ " for " +quntity+
				"quntity" );
	}

}
