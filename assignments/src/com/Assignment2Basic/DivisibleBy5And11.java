package com.Assignment2Basic;

import java.util.Scanner;

public class DivisibleBy5And11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		
		if((num % 5 == 0) && (num % 11 == 0)) {
			System.out.println(num+" Is Divible by 5 and 11"  );
		}
		else {
			System.out.println(num+ " Is Not Divible by 5 and 11"  );
		}
	}
}
