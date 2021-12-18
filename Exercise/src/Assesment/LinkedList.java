package Assesment;

import java.util.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

//import Assesment.UDRL.Node;

public class LinkedList {
	
	

		static Node head;

		static class Node {

			int data;
			Node next;

			Node(int d) {
				data = d;
				next = null;
			}
		}

		void remove_duplicates() {
			Node ptr1 = null, ptr2 = null, dup = null;
			ptr1 = head;
			while (ptr1 != null && ptr1.next != null) {
				ptr2 = ptr1;

				while (ptr2.next != null) {
				if (ptr1.data == ptr2.next.data) {

						dup = ptr2.next;
						ptr2.next = ptr2.next.next;
						System.gc();
					} else  {
						ptr2 = ptr2.next;
					}
				}
				ptr1 = ptr1.next;
			}
		}
		void printList(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}
		
		
		@Test
		public void test1() {
			LinkedList list = new LinkedList();
			   
	        list.head = new Node(3);
	        list.head.next = new Node(4);
	        list.head.next.next = new Node(3);
	        list.head.next.next.next = new Node(6);
	        System.out.println(     "Linked List before removing duplicates : \n ");
	        list.printList(head);
	       
	        list.remove_duplicates();
	        System.out.println("");
	        System.out.println(
	            "Linked List after removing duplicates : \n ");
	        list.printList(head);
		}
		@Test
		public void test2() {
			LinkedList list = new LinkedList();
			   
	        list.head = new Node(7);
	        list.head.next = new Node(7);
	        list.head.next.next = new Node(7);
	        list.head.next.next.next = new Node(7);
	        System.out.println(     "Linked List before removing duplicates : \n ");
	        list.printList(head);
	        list.remove_duplicates();
	        System.out.println("");
	        System.out.println(
	            "Linked List after removing duplicates : \n ");
	        list.printList(head);
		}

	

}
