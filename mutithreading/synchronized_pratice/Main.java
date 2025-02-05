package synchronized_pratice;


public class Main {

	public static void main(String[] args) {
		SharedResource sharedResource1 = new SharedResource();
		
		//creating producer thread using Lambda expression
		Thread th1 = new Thread(() -> {
			sharedResource1.producer();		
		});
		
		SharedResource sharedResource2 = new SharedResource();
		//creating producer thread using Lambda expression
		Thread th2 = new Thread(() -> {
			sharedResource2.producer();		
		});
		
		th1.start();
		th2.start();
	}
}
