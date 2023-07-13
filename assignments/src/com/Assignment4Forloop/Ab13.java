package com.Assignment4Forloop;

import java.util.Scanner;

public class Ab13 {
	public static void main(String[] args) {
		int sqrNum, temp,rem , c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        int num = sc.nextInt();
        temp=num;        
        while (temp > 0)
        {
            temp=temp/10;
            c++;
        }
        sqrNum = num * num;
        
        rem= sqrNum%(int)Math.pow(10, c);
        
        if(rem==num)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }
	}
	}


