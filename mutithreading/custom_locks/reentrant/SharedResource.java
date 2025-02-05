package custom_locks.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

	boolean isAvailable = false;
	public void producer(ReentrantLock reentrantLock) {
		try {
			reentrantLock.lock();
			System.out.println("Lock acquired by: " + Thread.currentThread().getName());
			isAvailable = true;
			Thread.sleep(4088);
		} catch (Exception e) {
		} finally {
			reentrantLock.unlock();
			System.out.println("Lock release by: " + Thread.currentThread().getName());
		}
	}
}
