package multiThreading;


public class Simple_1 {
	public static void main(String[] args) {
		Simple_2 s1 = new Simple_2("hello", 1000);
		Simple_2 s2 = new Simple_2("hllo", 2000);
		Simple_2 s3 = new Simple_2("he", 3000);
		s1.run();
		s2.run();
		s3.run();

		try {
			s1.join();
			s2.join();
			s3.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank you very much");

	}
}

 class Simple_2 extends Thread {
	private String message;
	private int time;
	
	public Simple_2(String message, int time) {
		super();
		this.message = message;
		this.time = time;
	}
	public void run() {
	for(int i = 1;i<=10;i++) {
		System.out.println("abc");
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}

}
 
