package ProducerConsumerProblem1;

public class ProduceTask implements Runnable {

	SharedResource sharedResource;

	ProduceTask(SharedResource resource) {
		this.sharedResource = resource;
	}

	@Override
	public void run() {
		System.out.println("Producer thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// handle any exception here
		}
		sharedResource.addItem();
	}
}
