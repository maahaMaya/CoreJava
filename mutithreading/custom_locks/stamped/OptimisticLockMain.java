package custom_locks.stamped;

public class OptimisticLockMain {

	public static void main(String args[]) {

		SharedResourceOtimisticFunc resource = new SharedResourceOtimisticFunc();

		Thread th1 = new Thread(() -> {
			resource.producer();
		});

		Thread th2 = new Thread(() -> {
			resource.consumer();
		});

		th1.start();
		th2.start();

	}
}
