package ProducerConsumerProblem;

//Question: Two threads, a producer and a consumer, share a common, fixed-size buffer as a queue. 
//The producer's job is to generate data and put it into the buffer, while the consumer's job is to consume the data from the buffer. 
//The problem is to make sure that the producer won't produce data if the buffer is full, and the consumer won't consume data if the buffer is empty.
public class ProducerConsumerLearning {
	
	public static void main(String[] args) {
		SharedResource sharedBuffer = new SharedResource(3);
		
		//creating producer thread using Lambda expression
		Thread producerThread = new Thread(() -> {
			try {
				for (int i = 1; i<= 6; i++) {
					sharedBuffer.produce(i);
					}
				} catch (Exception e) {
					//handle exception here
					}
			});

		//creating consumer thread using Lambda expression
		Thread consumerThread = new Thread(() -> {
			try {
				for (int i = 1; i<= 6; i++) {
					sharedBuffer.consume();
					}
				} catch (Exception e) {
					//handle exception here
					}
			});
		
		producerThread.start();
		consumerThread.start();
	}
}

//OUTPUT
//Buffer is empty, Consumer is waiting for producer
//Produced: 1
//Produced: 2
//Produced: 3
//Buffer is full, Producer is waiting for consumer
//Consumed: 1
//Consumed: 2
//Consumed: 3
//Buffer is empty, Consumer is waiting for producer
//Produced: 4
//Produced: 5
//Produced: 6
//Consumed: 4
//Consumed: 5
//Consumed: 6
