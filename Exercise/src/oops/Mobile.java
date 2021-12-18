package oops;

public class Mobile implements Android,Samsung,Oneplus
{
	 public void displayModel() {
	      System.out.println("display method of ");
	   }
	 
	 
	public static void main(String args[]) {
		Mobile obj = new Mobile();
	    obj.displayModel();
	    Android.display();
	   }

}
