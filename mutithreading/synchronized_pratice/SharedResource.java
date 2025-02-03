package synchronized_pratice;

public class SharedResource {
	
	boolean isAvailable = false;
	
	public synchronized void producer() {

		try {
			System.out.println("Lock acquire by : " + Thread.currentThread().getName());
			isAvailable = true;
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Lock release by : " + Thread.currentThread().getName());
	}
}
