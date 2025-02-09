package queue_impl;

public class LinkedListUsingArray {
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}	
	}
	static class Queue{

		static Node head = null;
		static Node tail = null;
		
		//check empty
		public static boolean isEmpty() {
			return head == null && tail == null;
		}
		
		//check full size no need because we can add any number of node
		public static boolean isFull() {
			return false;
		}
		
		//add
		public static void add(int data) {
			Node newNode = new Node(data);
			// 1st element
			if(head == null) {
				head = tail = newNode;
			}
			
			//general add
			tail.next = newNode;
			tail = newNode;
		}
		
		//remove
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			
			int front = head.data;
			
			//single element
			if(tail == head) {
				head = tail = null;
			}
			//general remove
			else {
				head = head.next;
			}	
			return front;
		}
		
		//peek
		public static int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			return head.data; 
		}
	}
	
	public static void main(String[] args) {

		Queue queue = new Queue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		while (!queue.isEmpty()) {
			System.out.println("Peek : " + queue.peek());
			queue.remove();
		}
	}
}
