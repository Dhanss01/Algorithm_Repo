package LinkedListLearning;

public class LinkedListexercie {

	
	class Node{
		int data;
		Node next;
		Node head;
	}
	
	void insertnode(int data)
	{
		Node node = new Node();
		node.data =data;
		node.next=null;
		
		if(node.head==null)
		{
			node.head=node;
		}
		
		else
		{
			Node n =node.head;
			while(n.next!=null)
			{
				n=n.next;
				
			}
			n.next=node;		
			
		}
	}
	
	void printnodes()
	{
		Node node = new Node();
		Node n= node.head;
		while(n.next!=null)
		{
			System.out.println(n.data);
		}
		System.out.println(n.data);
		
	}
}
