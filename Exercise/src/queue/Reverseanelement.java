package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class Reverseanelement {
	
	@Test
	public void test1()
	{
		
		int[] data = {2,4,6,7,10};
		int k= 3; // 6,4,2,7,10
		reversetarger(data, k);
	}
	
	@Test
	public void test2()
	{
		int[] data = {2,4,6,7,10};
		int k= 2; // 2,1,3,7,10
		reversetarger(data, k);
	}
	
	@Test
	public void test3()
	{
		int[] data = {10,4,5,7}; //queue.size == target then push it to stack and pop all the elements 
		int k= 4; // 7,5,4,10
		reversetarger(data, k);
	}
	@Test
	public void test5()
	{
		int[] data = {5,7}; // through the exceptions
		int k= 4; // 7,5,4,10
		reversetarger(data, k);
	}
	
	
	
	//add the values in queue 
	// based on target values perform dequeues and add it in stack
	// once the target value has been met then pop all the values in to results array 
	//dequeue the remaining elements from the queue and add to the results array 
	//queue.size == target then push it to stack and pop all the elements 
	
	public void reversetarger(int[] arr, int k)
	{
		Stack<Integer> mystack = new Stack<Integer>();
		Queue<Integer> myqueue = new ArrayDeque();
		
		
		
		for(int i=0; i<k;i++)
		{
			mystack.push(arr[i]);
		}
		
		int m = mystack.size();
		for(int i=0;i<k;i++)
		{
			
			myqueue.offer(mystack.pop());
		}
		
		for(int i =k; i<arr.length;i++)
		{
			myqueue.offer(arr[i]);
		}
		
		System.out.print(myqueue);
		
	}
	
	
	
}



