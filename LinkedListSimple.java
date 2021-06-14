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
	 * @param data
	 * data has element to be inserted in linkedlist.
	 * inserting new element at last position.
	 */
	public void insertAtLast(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node tempNode = head;
			while(tempNode.next != null)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	
	/**
	 * @param index
	 * index variable contains index number at which position we want to insert element.
	 * @param data
	 * data variable contains element that we want to insert.
	 * Inserting 30 at 1st index.
	 */
	public void insertAtLocation(int index, int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		/*if index is 0 then calling insertAtStart() function
		that will insert element at 0'th position.*/
		if(index == 0)
		{
			insertAtStart(data);
		}
		else
		{
			Node tempNode = head;
			for(int i=0; i<index-1; i++)
			{
				tempNode = tempNode.next;
			}
			newNode.next = tempNode.next;
			tempNode.next = newNode;
		}
		
	}
	
	/**
	 * @param index
	 * index variable contains index number.
	 * deleting element from specified index value.
	 */
	public void deleteAt(int index)
	{
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			System.out.println("Enter the correct index position");
		}
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
