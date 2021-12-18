package LinkedListLearning;

import org.junit.Test;

public class Node1 {

	static Node head;

	class Node {
		Node next;
		int data;

	}

	void insertnode(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}

			n.next = node;
		}
	}

	void printnode() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	@Test
	public void test1() {
		LearningOnLinkedList list1 = new LearningOnLinkedList();
		list1.insertnode(6);
		list1.insertnode(7);
		list1.insertnode(8);
		list1.printnode();

	}
}