package com.bridgelab;

public class LinkedListSimple
{
	Node head;
	
	/**
	 * @param data
	 * data has element to be inserted in linkedlist.
	 * inserting new element at first position.
	 */
	public void insertAtStart(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
	}
	
	/**
	 * Traversing through linkedlist.
	 * printing elements one by one.
	 */
	public void printList()
	{
		Node node = head;
		
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
}
