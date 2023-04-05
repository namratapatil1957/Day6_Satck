package com.bridgelabz.stack;

import java.util.*;

public class stack {
	
	public static void main(String[] args) {
		
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1.PUSH\n2.POP\n3.PEEK.\n4.EXIT");
			
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			
			StackOperations op = new StackOperations();
			
			switch (choice) {
			case 1:
				System.out.println("Enter element to push in STACK");
				op.push(sc.nextInt());
				break;
			
			case 2:
				op.pop();
				break;
				
			case 3:
				op.peek();
				break;
				
			case 4:
				System.out.println("Byee!!!");
				break;
				
			default:
				System.out.println("Select from menu only...");
			}
		
		} while (choice != 4);
		
	}
	
}

class StackOperations {
	
	private static int[] myStack = new int[5];
	private static int TOP = -1;

	private boolean isFull() {
		
		return (TOP == myStack.length - 1) ? true : false;
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("STACK IS FULL");
			
		} else {
			TOP = TOP + 1;
			myStack[TOP] = item;	
		}
	}

	public boolean isEmpty() {
		
		return (TOP <= -1) ? true : false;
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("STACK IS EMPTY");
			
		} else {
			System.out.println("pop element is: " + myStack[TOP]);
			myStack[TOP] = 0;
			TOP = TOP - 1;
		}
	}

	public void peek() {
		if (isEmpty()) {
			System.out.println("STACK IS EMPTY");
		} else {
			System.out.println("peek element is: " + myStack[TOP]);
		}
	}

}