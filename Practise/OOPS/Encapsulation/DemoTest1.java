package Encapsulation;

public class DemoTest1 
{

	public static void main(String[] args)
	{
	
		Demo1 obj = new Demo1();
		
		
//		obj.name = "Amit"; // Compilation error. Since name is private. 
//		
//		   String studentName = obj.name; //same as above. 
//		   
		   
		     obj.setName("Amit"); // setting the value of variable. 
		     String name = obj.getName(); // reading the value of variable. 
		     System.out.println(name); 
	}

}
