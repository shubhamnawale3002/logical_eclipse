package PrintPattern;

public class Halfpyramid {
	public static void main(String[] args) {
	int n= 4;
	for(int x=1
			;x<=n;x++) {
		for (int y=1;y<=x;y++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
