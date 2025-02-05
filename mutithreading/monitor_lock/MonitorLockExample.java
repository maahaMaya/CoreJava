package monitor_lock;

public class MonitorLockExample {

	public synchronized void task1() {
		// do something
		try {
			System.out.println("inside task1");
			Thread.sleep(10000);
			System.out.println("task1 Completed");
		} catch (Exception e) {
			// exception handling here
		}
	}

	public void task2() {
		System.out.println("task2, but before synchronized");
		synchronized (this) {
			System.out.println("task2, inside synchronized");
		}
	}
	
	public void task3() {
		System.out.println("task3");
	}
	
//	public static void main(String[] args) {
//		MonitorLockExample monitorLockExample = new MonitorLockExample();
//		
//		Thread t1 = new Thread(() -> { monitorLockExample.task1(); });
//		Thread t2 = new Thread(() -> { monitorLockExample.task2(); });
//		Thread t3 = new Thread(() -> { monitorLockExample.task3(); });
//		
//		t1.start();
//		t2.start();
//		t3.start();
//	}
}


//OUTPUT
//inside task1
//task2, but before synchronized
//task3
//task1 Completed
//task2, inside synchronized

