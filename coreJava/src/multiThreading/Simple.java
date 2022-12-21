package multiThreading;

 public class Simple {
	 public static void main(String[] args) {
			SimpleMain s1 = new SimpleMain();
		s1.start();	
	
		}
}
 class SimpleMain extends Thread{
	
	public void run() {
		System.out.println("hello world");
	}
	
}
