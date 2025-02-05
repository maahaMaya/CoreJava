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
		public static boolean isEmpty() {
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
			System.out.println("--------------------------");
			System.out.println("front index is : " + front);
			System.out.println("rear index is : " + rear);
			System.out.println("--------------------------");
			arr[rear] = data;
		}
		
		//remove
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			
			int frontValue = arr[front];
			
			//last element
			if(rear == front) {
				rear = front = -1;
			}else {
				front = (front + 1)  % size;
				System.out.println("--------------------------");
				System.out.println("front index is : " + front);
				System.out.println("rear index is : " + rear);
				System.out.println("--------------------------");
			}
			return frontValue; 
		}
		
		//peek
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			return arr[front]; 
		}
	}
	
	public static void main(String[] args) {

		Queue queue = new Queue(3);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println("Removed : " + queue.remove());
		queue.add(4);
		System.out.println("Removed : " + queue.remove());
		queue.add(5);
		
		while (!queue.isEmpty()) {
			System.out.println("Removed : " + queue.remove());
		}
	}
}


//--------------------------
//front index is : 0
//rear index is : 0
//--------------------------
//--------------------------
//front index is : 0
//rear index is : 1
//--------------------------
//--------------------------
//front index is : 0
//rear index is : 2
//--------------------------
//--------------------------
//front index is : 1
//rear index is : 2
//--------------------------
//Removed : 1
//--------------------------
//front index is : 1
//rear index is : 0
//--------------------------
//--------------------------
//front index is : 2
//rear index is : 0
//--------------------------
//Removed : 2
//--------------------------
//front index is : 2
//rear index is : 1
//--------------------------
//--------------------------
//front index is : 0
//rear index is : 1
//--------------------------
//Removed : 3
//--------------------------
//front index is : 1
//rear index is : 1
//--------------------------
//Removed : 4
//Removed : 5

