package com.Assignment1;

import java.util.Scanner;

public class AreaofCircle {
	public static void main(String[] args) {
	
	double pi= 3.14 , area;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Radius of circle :");
	int r = sc.nextInt();
	
	area = pi * r * r;
	System.out.println("Area of Circle :" +area);
	sc.close();
	}

}
