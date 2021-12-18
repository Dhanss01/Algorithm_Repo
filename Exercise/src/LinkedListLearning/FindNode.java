package LinkedListLearning;

import javax.swing.tree.TreeNode;

import LinkedListLearning.LearningOnLinkedList.Node;

public class FindNode {
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
	 
	 int min=Integer.MAX_VALUE;
	    Integer pre=null;
	    public int getMinimumDifference(TreeNode root) {
	        Inorder(root);
	        return min;
	        
	    }
	    //1,2,3,4,6
	    public void Inorder(TreeNode node) {
			if (node != null) {;
				Inorder(node.left);                           
	            if(pre!=null)
	                min=Math.min(min,Math.abs(pre-node.val));
				//System.out.println(node.val);           
	            pre=node.val;
				Inorder(node.right);
	                           
			}
		}
	 
	 
	 
	 

}
