package Encapsulation;

public class StudentTest 
{

	public static void main(String[] args) 
	{
		
		Student obj= new Student();
		
		obj.setName("Dhoni");
		obj.setid(7);
		obj.setRollno(777);
		
		System.out.println(obj.getname());
		System.out.println(obj.getid());
		System.out.println(obj.getrollno());
	}

}
