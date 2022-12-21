package com.logical;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xyz = sc.nextInt();
		int fat = 1;
		for (int i = 1;i<=xyz;i++) {
			fat = fat*i;
			
		}System.out.println(fat);
	}

}
