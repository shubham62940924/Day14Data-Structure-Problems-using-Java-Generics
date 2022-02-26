/*
* @purpose :Ability to create Linked List by adding 30 and 56 to 70 - Node with data 70 And add first method,
  Add last method
 LinkedList Sequence: 56->30->70
*  Node with data 70 is First Created
	- Next 30 is added to 70
	- Finally 56 is added to 30
	- Ability to delete the first element in the LinkedList of sequence 56->30->70 - 
    Delete last
    Search element
	 */
package com.blz.Day14;

import java.util.Scanner;

public class LinkedList {
	Scanner scanner = new Scanner(System.in);

	Node head;

	class Node {
		Object data;
		Node next;// next is a reference

		public Node(Object data) {
			this.data = data;
		}
	}

	/*
	 * add first method
	 */
	public void addFirst(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	/*
	 * display linked list method
	 */
	public void display() {
		if (head == null)
			System.out.println("No elements to display");
		else {
			Node temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	/*
	 * Add last method
	 */
	public void addLast(Object data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else if (head.next == null)
			head.next = newNode;
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	/*
	 * add middle method
	 */

	public void addMiddle(Object data, Object data1) {
		Node newNode = new Node(data);

		if (head == null)
			head = newNode;
		else {
			Node temp = head;
			while (temp.data != data1) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}

	// delete first method

	public void deleteFirst() {
		if (head == null)
			System.out.println("No elements present to delete");
		else
			head = head.next;
	}

	// delete last method

	public void deleteLast() {
		if (head == null)
			System.out.println("No elements present to delete");
		else if (head.next == null)
			head = null;
		else {
			Node temp = head;// creating temp object assigining head to it
			while (temp.next.next != null)
				temp = temp.next;
			temp.next = null;
		}
	}

	public void searchElement(Object data) {
		byte flag = 0;
		if (head == null)
			System.out.println("No elements present to search");
		else {
			Node temp = head;
			while (temp != null) {
				if (data.equals(temp.data)) {
					flag = 1;
					System.out.println(data + " is present in linked list");
					break;
				}
				temp = temp.next;
			}
			if (flag == 0)
				System.out.println(data + " is absent in linked list");
		}
	}

}