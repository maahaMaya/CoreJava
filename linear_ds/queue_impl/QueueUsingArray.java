package queue_impl;

public class QueueUsingArray {

	static class Queue{
		static int[] arr;
		static int size;
		static int rear;
		
		Queue(int n){
			arr = new int[n];
			size = n;
			rear = -1;
		}
		
		//check empty
		public static boolean isEmplty() {
			return rear == -1;
		}
		
		//add
		public static void add(int data) {
			if(rear == size-1) {
				System.out.println("Queue is full!");
				return;
			}
			rear = rear + 1;
			arr[rear] = data;
		}
		
		//remove from queue
		public static int remove() {
			if(isEmplty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			
			int frontValue = arr[0];
			for(int i = 0; i < rear; i++) {
				 arr[i] =  arr[i+1];
			}
			rear = rear - 1;
			return frontValue; 
		}
		
		//peek
		public static int peek() {
			if(isEmplty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			return arr[0]; 
		}
	}
	
	public static void main(String[] args) {

		Queue queue = new Queue(5);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		while (!queue.isEmplty()) {
			System.out.print(" <- " + queue.peek());
			queue.remove();
		}

	}

}
