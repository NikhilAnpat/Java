
import java.util.Scanner;
class Addition
{

	// instance  variables
	int i , j ;

	//acceptData    - camel case 
	public void acceptData()
	{	
                System.out.println(" in acceptData Method");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a 1st number : ");
		i  = s.nextInt();
		System.out.print("Enter a 2nd number : ");
		j  = s.nextInt();

	}

	//no arguments 
	// access specifier   return type   method name()
	public void doAddition()
	{
                System.out.println(" in doAddition Method");
		//local 
		int c = i+j;
		System.out.println("Addition is : " + c);
		System.out.println("Addition is : " + (i+j));

	}

	public void doAddition(int a   , int b )
	{
	System.out.println(" in doAddition Method with arguments ");
	System.out.println("Addition is : " + (a + b));

	}

	public static void main(String[] args){
// linear execution 
		System.out.println(" in Main Method");
		// new  -  allocate memory 
		Addition a = new Addition();  // Object 
		// Object     .   methodName();
		a.acceptData(); // input 
		a.doAddition();  // output 
                 
		

	}








}