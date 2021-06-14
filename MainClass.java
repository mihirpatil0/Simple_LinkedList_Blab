package com.bridgelab;

public class MainClass 
{
	 public static void main(String[] args)
	 {
		 LinkedListSimple linkedListObejct = new LinkedListSimple();
		 
		 linkedListObejct.insertAtLast(56);
		 linkedListObejct.insertAtLast(30);
		 linkedListObejct.insertAtLast(70);
		 
		 linkedListObejct.deleteAt(2);
		 linkedListObejct.printList();
	 }
}
