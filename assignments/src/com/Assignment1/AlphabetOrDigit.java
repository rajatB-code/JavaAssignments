package com.Assignment1;

import java.util.Scanner;

public class AlphabetOrDigit {
	public static void main(String[] args) {
		char ch;
		  Scanner sc =new Scanner(System.in);
		  System.out.print("Enter any char : ");
		  ch=sc.next().charAt(0);
		  
		  if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		  {
		   System.out.println(ch+" is Alphabet");
		  }
		  else if(ch>='0'&&ch<='9')
		  {
		   System.out.println(ch+" is Digit");
		  }
		  else
		  {
		   System.out.println(ch+" is spacial Symbol");
		  }
		 }
	}


