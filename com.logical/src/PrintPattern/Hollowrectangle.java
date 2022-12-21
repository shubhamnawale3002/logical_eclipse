package PrintPattern;

import java.util.Scanner;

public class Hollowrectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		 for (int x=1;x<=a;x++) {
			 for (int y=1;y<=b;y++) {
				 if (x==1||y==1||x==a||y==b) {
					 System.out.print("*");
					 }
				 else {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
			 
		 }
	}

}
