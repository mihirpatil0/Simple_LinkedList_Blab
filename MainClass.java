package com.bridgelab;

public class MainClass 
{
	 public static void main(String[] args)
	 {
		 LinkedListSimple linkedListObejct = new LinkedListSimple();
		 
		 linkedListObejct.insertAtLast(56);
		 linkedListObejct.insertAtLast(30);
		 linkedListObejct.insertAtLast(70);
		 
		 linkedListObejct.printList();
		 //Searching for the element in linkedlist if found printing message else not found.
			/*
			 * if(linkedListObejct.find(30)) {
			 * System.out.println("\nSearch element found."); } else {
			 * System.out.println("Search element not found."); }
			 */
		 
		 linkedListObejct.sort();
		 System.out.println("After sorting: ");
		 linkedListObejct.printList();
	 }
}
