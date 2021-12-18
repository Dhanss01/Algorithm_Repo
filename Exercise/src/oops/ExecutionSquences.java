package oops;

public class ExecutionSquences {
	
	{
		System.out.println("Instansiated Call");
	}

	static
	{
		System.out.println("static Call");
	}
	
	void Methodcall()
	{
		System.out.println("static Call");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutionSquences es = new ExecutionSquences();
		
	}

}
