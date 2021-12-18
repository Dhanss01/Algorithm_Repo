package algo_easyProblemsset2;

import org.junit.Test;

public class productsumDiff {
	
	@Test
	public void test1()
	{
		int N=234;
		System.out.println(subtractProductAndSum(N));
				
	}
	
	
public int subtractProductAndSum(int n) {
        
        String s = String.valueOf(n); int sum=0, product=1, res;
        for(int i=0;i<s.length();i++)
        {
        	
            int r=s.charAt(i)-'0';
            sum=sum+r;
            product=product*r;
        }
        
        
        res=product-sum;
        return res;
    }

}
