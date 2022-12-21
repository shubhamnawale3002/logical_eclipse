package com.logical;

public class FIbonacci_Series {

	public static void main(String[] args) {
	
	int f = 1;
	int s = 1;
	int t;
	System.out.println(f);
	System.out.println(s);
	for (int i = 3;i<=10;i++) {
		t=f+s;
		System.out.println(t);
		f=s;
		s=t;
	}

	}

}
