package algo_EasyProblmes;

public class SmallestPositiveInteger {
	public void test1() 
	{
		int n=25;
	}
	
	public int getSmallestPrimeDivisor(int n) {
		if(n%2==0) {
			return 2;
		}
		else {
			for(int i=3; i*i<=n;i+=2) {
				if(n%i==0) {
					return i;
				}
			}
		}
	 return n;
	}

}
