package LinkedListLearning;

import org.junit.Test;

import LinkedListLearning.LearningOnLinkedList.Node;

public class MergetwoLinkedList {

	static Node head;
	
	 class Node {
		
		Node next;
		int data;
		}
	 
	
	 void insertnode(int data)
	 {
		 Node node=new Node();
		 node.data=data;
		 node.next=null;
		 
		 if(head==null)
		 {
			 head=node;
		 }
		 else
		 {
			 Node n=head;
			 while(n.next!=null)
			 {
				 n=n.next;
			 }
			 
			 n.next=node;
		 }
	 }
	 public Node mergeTwoLists(Node list1, Node list2) {
		 
		 Node list3= new Node();
		 list3.next=null;
		 list3
		
		 
		 return list3;
	        
	    }
	 
	 
	 @Test
		public void test1() {
			LearningOnLinkedList list1 = new LearningOnLinkedList();
			list1.insertnode(1);
			list1.insertnode(2);
			list1.insertnode(4);
			list1.insertnode(6);
			LearningOnLinkedList list2 = new LearningOnLinkedList();
			list1.insertnode(6);
			list1.insertnode(7);
			list1.insertnode(10);
			list1.insertnode(13);
		}
}