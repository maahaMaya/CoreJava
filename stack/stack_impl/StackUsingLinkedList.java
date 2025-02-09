package stack_impl;

import java.util.ArrayList;

import stack_impl.StackUsingArrayList.Stack;

public class StackUsingLinkedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class Stack {

		static Node head = null;

		// check empty
		public static boolean isEmpty() {
			return head == null;
		}

		// check full size no need because we can add any number of node
		public static boolean isFull() {
			return false;
		}

		// add
		public static void push(int data) {
			Node newNode = new Node(data);
			// 1st element
			if (isEmpty()) {
				head = newNode;
				return;
			}

			// general add
			newNode.next = head;
			head = newNode;
		}

		// remove
		public static int pop() {
			if (isEmpty()) {
				System.out.println("Stack is empty!");
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}

		// peek
		public static int peek() {
			if (isEmpty()) {
				System.out.println("Stack is empty!");
				return -1;
			}
			return head.data;
		}
	}

	public static void main(String[] args) {

		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		while (!stack.isEmpty()) {
			System.out.print(" <- " + stack.peek());
			stack.pop();
		}

	}

}
