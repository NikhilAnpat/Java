
public class Student 
{
	
	String name;
	int rollno;
	
	public Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	public static void main(String[] args) 
	{

		 Student[] st = new Student[]
				  { new Student("Deep", 01), 
				     new Student("John", 02), 
				     new Student("Herry", 03),new Student("Deep", 01), 
				     new Student("John", 02), 
				     new Student("Herry", 03)
				  };
		
		 
		 for(int i = 0; i < st.length; i++)
		 {
		     System.out.println("Name: " +st[i].name+ ", "+"Roll no: " +st[i].rollno);	
		   }
		 
		 System.out.println(st.length);
	}

}
