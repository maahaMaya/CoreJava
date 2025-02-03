package synchronized_pratice;


public class Main {

	public static void main(String[] args) {
		SharedResource resource1 = new SharedResource();
		
		//creating producer thread using Lambda expression
		Thread th1 = new Thread(() -> {
			resource1.producer();		
		});
		
		SharedResource resource2 = new SharedResource();
		//creating producer thread using Lambda expression
		Thread th2 = new Thread(() -> {
			resource2.producer();		
		});
		
		th1.start();
		th2.start();
	}
}
