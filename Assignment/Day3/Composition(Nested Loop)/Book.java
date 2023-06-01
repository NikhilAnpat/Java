package Test;

public class Book 
{
	private int bkid;
	int cnt=0;
	private String bkname;
	 Lesson lesson;
	
	public Book(int id,String name,Lesson l)
	{
		this.bkid=id;
		this.bkname=name;
		this.lesson=l;
	}
	
	public class Lesson
	{
		private int lessonid;
		int cnt=10;
		private String lname;
		
		public void m2()
		{
			System.out.println(cnt);
			System.out.println("In lesson class method");
			m1();
		}
	}	
		
		public void m1()
		{
			System.out.println("In book class method");
		}
		
		public void m3()
		{
			lesson.m2();
		}
		
		public void setLesson(Lesson l)
		{
			this.lesson=l;
		}
		public String toString() 
		{
			return "Book id :"+this.bkid+"\nBook Name :"+this.bkname+" \nLesoon "+lesson;
		}
	
}
