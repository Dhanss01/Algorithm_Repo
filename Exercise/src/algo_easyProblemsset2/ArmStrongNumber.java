package algo_easyProblemsset2;

public class ArmStrongNumber {
public void test1()
{
	int n=125;
}
public void test2()
{
	int n =153;
}

static boolean isArmstrong(int n)   
{   
int temp, digits=0, last=0, sum=0;   

temp=n;   
  
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   


temp = n;   
while(temp>0)   
{   
  
last = temp % 10;   
sum +=  (Math.pow(last, digits));    
temp = temp/10;   
}  
  
if(n==sum)   

return true;      
 
else return false;   
}   

}
