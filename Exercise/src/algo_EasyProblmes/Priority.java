package algo_EasyProblmes;

import java.util.PriorityQueue;

import org.junit.Test;

public class Priority {
	
	 @Test
	    public void test1() {
	        int n[]= {9,5,3,2,1};
	        int k=3;
	        findMax(n,k);
	    }
	 /*   @Test
	    public void test2() {
	        int n[]= {5};
	        int k=2;
	        findMax(n,k);
	    }
	    @Test
	    public void test5() {
	        int n[]= {1,1,1};
	        int k=1;
	        findMax(n,k);
	    }
	 
		@Test
	    public void test3() {
	        int n[]= {1,1,1};
	        int k=3;
	        findMax(n,k);
	    }
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
private int findMax(int[] n, int k) {
				// TODO Auto-generated method stub
	
	if(n.length<k) {
		return -1;
	}
	
	PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
	//PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

	
	for(int i=0;i<n.length;i++) {
		pr.add(n[i]);
	}
	System.out.print(pr);
	
	//System.out.print(pr.poll());
	//System.out.print(pr.peek());
	
	
	return 1;			
}


}
