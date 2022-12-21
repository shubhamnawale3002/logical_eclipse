package com.logical;

import java.util.Scanner;

public class Armstrong_Number {
	
	
	public static void main(String[] args) {
	//double a=153;
		System.out.println("enter a number");
		Scanner scc = new Scanner(System.in);
		int a = scc.nextInt();
		System.out.println(a);
		int n = 153;
		double temp ;
	double Armstrong=0;
	while (n>0) {
		temp= n % 10;
		temp=Math.pow(temp, 3);
		Armstrong=Armstrong+temp;
		temp=temp/10;
		n=n/10;
	}
	if(Armstrong==a) {
		System.out.println("yess..!");
		
	}
	else{
		System.out.println("nooo....!!!");
	
}
	}
}
