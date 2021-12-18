package oops;

public interface Android {
	
	public static final int price = 0;
	
	 public static void display() {
	      System.out.println("Static method of the interface");
	   }
	
	   public default void displayModel() {
	      System.out.println("display method of ");
	   }

}
