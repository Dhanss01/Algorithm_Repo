package algo_easyProblemsset2;

import java.awt.List;
import java.util.ArrayList;

public class MinStack {
	
	 
	
    ArrayList<Integer> list= new ArrayList<Integer>();

    
    public MinStack() {
        
    }
	    
	    public void push(int val) {
	       list.add(val);
	    }
	    
	    public void pop() {
	    if(!list.isEmpty())
	     list.remove(list.get(list.size()-1));
	    
	    }
	    
	    public int top() {
	       int k = list.get(list.size()-1);
		return k;
	    }
	    
	    /*public int getMin() {
	       /*int min=Integer.MAX_VALUE;
	       for(int i=; i<list.size();i++)
	       {
	    	   if(min>list.get(i))
	    	   {
	    		   min=list.get(i);
	    	   }
	       }
	    	 int k = list.get(list.size()-1);
	       return min;
	       
	       */
	    }

