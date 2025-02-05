package custom_locks.readwrite;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

	public static void main(String args[]) {

		SharedResource resource = new SharedResource();
		ReadWriteLock lock = new ReentrantReadWriteLock();

		Thread th1 = new Thread(() -> {
			resource.producer(lock);
		});

		Thread th2 = new Thread(() -> {
			resource.producer(lock);
		});

		SharedResource resource1 = new SharedResource();
		Thread th3 = new Thread(() -> {
			resource1.consune(lock);
		});

		th1.start();
		th2.start();
		th3.start();
	}
}

//Read Lock acquired by: Thread-0
//Read Lock acquired by: Thread-1
//Read Lock release by: Thread-0
//Read Lock release by: Thread-1
//Write Lock acquired by: Thread-2
//Write Lock release by: Thread-2
