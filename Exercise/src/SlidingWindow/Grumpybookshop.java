package SlidingWindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Grumpybookshop {
	
	@Test
	public void example1()
	{
		int[] customers= {1,0,1,2,1,1,7,5};
		int[] grumpy = {0,1,0,1,0,1,0,1};
		int target =3;
		int output= 16;
		assertEquals(16, customersatisfaction(customers,grumpy, target));
	}
		
		public int customersatisfaction(int[] customers, int[] grumpy,int target )
		{
			int i=0; 
			int customerssums=0;
			
			for(int n=0;i<customers.length;n++)
			{
			if(grumpy[i]==0)
			{
				customerssums=customerssums+customers[i];
			}
			}
			int maxsum= customerssums;

          for(int i1=0; i1<target;i1++)
          {
			if(grumpy[i1]==1)
			{
				customerssums=customerssums+customers[i1];
			}			
		
		}
          maxsum=Math.max(maxsum,customerssums);
          int start =0 ;
          while(target<customers.length) {                                 		  
  			if(grumpy[target] == 1){       // looking for my sales                                	
  				customerssums += customers[target];
              }
  			if(grumpy[start] == 1){
  				customerssums -= customers[start]; // sliding concept
            }
			
  			maxsum=Math.max(maxsum, customerssums);
            target++;
            start++;
          }
			return 0;
		}
		
	

}
