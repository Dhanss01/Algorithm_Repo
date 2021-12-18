package recurrsions;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class RemoveDuplicateRecurrsion {
	


		public class Node {
			int value;
			Node next;

			Node(int key) {
				this.value = key;
				next = null;
			}
		
		}
		public Node addNode(int key) {
			return new Node(key);
		}

		public void printAllNodes(Node node) {
			while (node != null) {
				System.out.println(node.value);
				node = node.next;
			}
		}

		Node findRemoveDupRecursion(Node node, int target) {
			if (node == null)//10 
				return node;
			if (node.value != target) {
				Node temp = findRemoveDupRecursion(node.next, target);
				node.next = temp;
			} else {//10
				Node temp = findRemoveDupRecursion(node.next, target);
				return temp;
			}
			return node;
		}

		@Test
		public void test1() {
			Node head = addNode(10);
			head.next = addNode(11);
			head.next.next = addNode(12);
			head.next.next.next = addNode(11);

			System.out.println("Linked List before removing duplicates : \n ");
			printAllNodes(head);
			// System.out.println(findRemoveDupRecursion(head, 10));

			System.out.println("");
			System.out.println("Linked List after removing duplicates : \n ");

			printAllNodes(findRemoveDupRecursion(head, 11));

		}

	}


