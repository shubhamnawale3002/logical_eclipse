package com.logical;

public class Palindriome {

	public static void main(String[] args) {
		String x ="madam";
		int i=0,j=x.length()-1;
		while(i<j) {
			if(x.charAt(i)!=x.charAt(j)) {
				System.out.println("not palindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
				System.out.println("its palindrome");
			
		}
	}

