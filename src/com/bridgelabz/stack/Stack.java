package com.bridgelabz.stack;

import java.util.*;

public class Stack {
	
public static void main(String[] args) {
		
		int choice = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("\n1.PUSH \n2.EXIT");
			
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			
			StackOperations op = new StackOperations();
			
			switch (choice) {
			
			case 1:
				System.out.println("Enter element to push in STACK");
				op.push(sc.nextInt());
				break;
				
			case 2:
				System.out.println("Byee!!!");
				break;
			default:
				System.out.println("Select from menu only...");
			
			}
		
		} while (choice != 2);	
	
	}		

}

class StackOperations {	
	
	 static int[] myStack = new int[5];
	 static int TOP = -1;

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

}
