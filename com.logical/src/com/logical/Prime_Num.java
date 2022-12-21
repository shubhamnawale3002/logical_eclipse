package com.logical;

public class Prime_Num {

	//0 and 1 are not prime numbers.
	//The 2 is the only even prime number because all the other even numbers can be divided by 2.
	
	public static void main(String[] args) {
	 int n = 17;
	 boolean prime = true;
	 for (int i = 2;i<n;i++){
		 if(n%i==0) {
			 prime = false;
			 break; 
		 }
	 }System.out.println(prime);
	
	
	}
	

}
