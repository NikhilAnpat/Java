import java.util.Scanner;

// template Object 
public class Student {
	// Structure 
	 String name; // non primitive , non static 
	 int m1 , m2 , m3;  // 0  default encapsulation  
	// Constructor  Object  new 
	// 
	// JVM Default Constructor // No Args Constructor  
// 1 class  -  multiple Constrcutor 	
	// Signature should be different 
	// Constructor Overloading 
	  public Student() { 
		  System.out.println("in Student Constructor"); m1 = 56;//
	  }
	 
	//parametrised lab open //  assignments revise 
	public Student(int i) {
		System.out.println("in Student parametrised Constructor");
		m1 = i;  // assignment operator 
	}
	
	// method   reuse 
	
	//acceptData non static	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name : " );
		name = sc.next();
		System.out.print("Enter a Marks  : " );
		m1 = sc.nextInt();  // -ve 
		System.out.print("Enter a Marks  : " );
		m2 = sc.nextInt();  // String int 
		System.out.print("Enter a Marks  : " );
		m3 = sc.nextInt();  // String int 
		
	}
	
	public void calcAvarage() {
		// float int  == 12.25  // 45.0
		float avg = (float) (m1+m2+m3)/3;
		System.out.println("Average "+ avg);
		
	}
	
	public void showData() {
		
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//method signature match 
	Student s  = new Student();  // default10 Memory  Heap default 
	Student s1  = new Student(78);  // parametrised 
	Student s2  = new Student(); // default
		System.out.println("Marks : "+ s.m1);// 0 ,
		System.out.println("Marks : "+ s1.m1);
		System.out.println("Marks : "+ s2.m1);//56
		//s.acceptData();
		
		
		
		
		
		
		/*
		 * s.acceptData(); // instance variable s.calcAvarage();
		 * 
		 * // decimal double 8 bytes float f = (float) 15.3; // double byte b = 48; //
		 * int
		 * 
		 * int i = 100; // 4 long l = i;// auto int a = (int) l;
		 * 
		 * String s1 = "asd"; char c = 'a'; // 2 bytes 1 bytes
		 */		//JAVA UTF  Unicode format Globally 
	}

}








