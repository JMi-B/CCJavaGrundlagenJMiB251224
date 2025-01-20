package oop.thema1.grundlagen.datenstrukturen.arraylist;

public class SinglyLinkedList {

	// Arrtibut

	private Node head;

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				System.out.println(current.data + "->");
			
			current = current.next;
			}
			
			public void display() {
				Node current = head;
				while (current != null) {
					System.out.println(current.data + "->");
					current = current.next;
				}
			}
				
			System.out.println("null");
		
		
		
			
			System.out.println("null");
		
	}


