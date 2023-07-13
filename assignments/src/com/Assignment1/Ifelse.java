package com.Assignment1;

import java.util.Scanner;

public class Ifelse {
public static void main(String[] args) {
		int sub1 , sub2, sub3, sub4, sub5;
		int total;
		
		float per;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the sub marks: ");
		sub1 =sc.nextInt();
		sub2 =sc.nextInt();
		sub3 =sc.nextInt();
		sub4 =sc.nextInt();
		sub5 =sc.nextInt();
		

	total = sub1 + sub2 + sub3 + sub4 + sub5 ;
	per = (total/5);
	System.out.println("total no. of subject :" +total);
	System.out.println("percentage"  +per);
	
	if (per > 70)
	{
		System.out.println(per+ "  +A");
		
	}
	else if(per>60) {
		System.out.println(per+ "  A");
		
	}
	else if(per>50) {
		System.out.println(per+ "  B");
		
	}
	else if(per>40) {
		System.out.println(per+ "  C");
	}
	else if(per>35) {
		System.out.println(per+ "  D");
	}
	sc.close();
}
}
