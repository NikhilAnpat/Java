import java.util.Scanner;
// import java defined lib jdk , jre 
class Hello {

	

	public  static void main(String[] a)
	{
		System.out.println("Hello World");  // \n
		
		System.out.print("Welcome");
		//class Object input 
		Scanner sc = new Scanner(System.in);//command promt
		
		System.out.print("Enter a Number :");
		
		// variable 
		
		// Integer.parseInt 
		
		int i  = Integer.parseInt(sc.next());  // String

		int j  = sc.nextInt();
		
		System.out.println( i );//print string 

System.out.println(" data entered " + i );

	}




}