package algo_easyProblemsset2;

public class Signfunction {
//-1,-2,-3,-4,3,2,1
	
	public void test()
	{
		int[] nums= {-1,-2,-3,-4,3,2,1};
	}
	public int 	arraySign(int[] nums)
	{
		int negativecount=0;
		for(int i=0;i<nums.length;i++)
		{
		   if(nums[i]==0)
		   {
			   return 0; 
		   }
		   else if(nums[i]<0)
		   {
			   negativecount++;
		   }		   		   
		}
		if(negativecount%2==0)
		   {
			   return 1;
		   }
		return -1;
	}
}
