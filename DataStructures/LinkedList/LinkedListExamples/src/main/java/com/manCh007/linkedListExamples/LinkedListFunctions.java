package com.manCh007.linkedListExamples;

import com.manCh007.linkedListExamples.Model.Node;

public class LinkedListFunctions {

	public static void main(String[] args) {
		
		Node head = null;
		Node tail = null;
		
		for(int data=5; data<10; data++) {
			Node n = new Node(data);
			if(head == null) {
				head = n;
				tail = n;
			} else {
				tail.setNext(n);
				tail = n;
			}
		}
		
		display(head);
		findElement(head, 13);
	}

	private static void findElement(Node head, int i) {
		if(head==null)
			System.out.println("LinkedList is empty");
		else {
			Node current = head;
			int j=0;
			while(current!=null) {
				if(current.getData()==i) {
					System.out.println("Data present the position is : "+j);
					return;
				}
				current = current.getNext();
				j++;
			}
			System.out.println("Number "+i+" is not present in the LinkedList !");
		}
	}

	private static void display(Node head) {
		if(head==null)
			System.out.println("LinkedList is empty");
		else {
			Node current = head;
			while(current!=null) {
				System.out.print(current.getData()+"-->");
				current = current.getNext();
			}
			System.out.print("null");
			System.out.println();
		}
	}
}
