package algo_easyProblemsset2;

import java.util.Scanner;

public class MultplicationofTwonumber {
	
	
	public static void main(String args[])   
	{  
		int x, y,sum=0;
		Scanner sc=new Scanner(System.in);  
		x=sc.nextInt();
		y=sc.nextInt();
		for(int i =0;i<=x;i++)
		{
			sum=sum+y;
		}
		System.out.println(sum);
	}

}
