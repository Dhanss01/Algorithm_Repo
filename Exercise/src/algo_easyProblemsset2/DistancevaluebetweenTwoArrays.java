package algo_easyProblemsset2;

import org.junit.Test;

public class DistancevaluebetweenTwoArrays {
	
	@Test
	public void test1()
	{
		int[] arr1= {4,5,8};
		int[] arr2= {10,9,1,8};
		int d=2;
		findTheDistanceValue(arr1,arr2,d);
	}
	
public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        int dist=0;int count=0;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                 dist =Math.abs(arr1[i]-arr2[j]);
                if(dist<=d)
                {
                    count++;
                }
            }
        }
        return count-1;
        
    }

}
