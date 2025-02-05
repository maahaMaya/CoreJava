package custom_locks.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
	public static void main(String args[]) {

		ReentrantLock reentrantLock = new ReentrantLock();
		SharedResource sharedResource1 = new SharedResource();
		Thread th1 = new Thread(() -> {
			sharedResource1.producer(reentrantLock);
		});
		
		SharedResource sharedResource2 = new SharedResource();
		Thread th2 = new Thread(() -> {
			sharedResource2.producer(reentrantLock);
		});

		th1.start();
		th2.start();
	}
}

//Lock acquired by: Thread-0
//Lock acquired by: Thread-1
//Lock release by: Thread-0
//Lock release by: Thread-1