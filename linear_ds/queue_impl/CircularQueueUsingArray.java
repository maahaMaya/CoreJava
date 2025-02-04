package queue_impl;


public class CircularQueueUsingArray {

	static class Queue{
		static int[] arr;
		static int size;
		static int rear;
		static int front;
		
		Queue(int n){
			arr = new int[n];
			size = n;
			rear = -1;
			front = -1;
		}
		
		//check empty
		public static boolean isEmplty() {
			return rear == -1 && front == -1;
		}
		
		//check full
		public static boolean isFull() {
			return (rear+1) % size == front;
		}
		
		//add
		public static void add(int data) {
			if(isFull()) {
				System.out.println("Queue is full!");
				return;
			}
			
			// add 1st element
			if(front == -1) {
				front = 0;
			}
			
			rear = (rear + 1) % size;
			arr[rear] = data;
		}
		
		//remove
		public static int remove() {
			if(isEmplty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			
			int frontValue = arr[front];
			
			//last element
			if(rear == front) {
				rear = front = -1;
			}else {
				front = (front + 1)  % size;
			}
			return frontValue; 
		}
		
		//peek
		public static int peek() {
			if(isEmplty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			return arr[front]; 
		}
	}
	
	public static void main(String[] args) {

		Queue queue = new Queue(5);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue.remove());
		queue.add(4);
		System.out.println(queue.remove());
		queue.add(5);
		
		while (!queue.isEmplty()) {
			System.out.println (queue.peek());
			queue.remove();
		}

	}

}
