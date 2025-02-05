package monitor_lock;

public class MonitorLock {

	public static void main(String[] args) {
		MonitorLockExample monitorLockExample = new MonitorLockExample();
		
		MonitorThread1 runnableObj = new MonitorThread1(monitorLockExample);
		Thread t1 = new Thread(runnableObj);
		//Thread t1 = new Thread(() -> { monitorLockExample.task1(); });
		Thread t2 = new Thread(() -> { monitorLockExample.task2(); });
		Thread t3 = new Thread(() -> { monitorLockExample.task3(); });
		
		t1.start();
		t2.start();
		t3.start();
	}
}
