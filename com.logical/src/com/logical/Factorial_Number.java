package com.logical;

import java.util.Scanner;

public class Factorial_Number {
	
	
	public static void main(String[] args) {
		System.out.println("enter the number for factorial");
		Scanner sc = new Scanner(System.in);
		int xyz = sc.nextInt();
		
		int fact = 1;
		
		
		for(int i=1;i<=xyz;i++) {
			fact = fact*i;
		}
		System.out.println("factorial of the givens number is:" +fact);
	}
	
}
