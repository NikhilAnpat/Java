package Test;
import Test.Book;
import Test.Book.Lesson;
import Test.ParentClass;
import static Test.Book.*;

public class TestBookClass 
{

	public static void main(String[] args) 
	{
		 Book b=new Book(12,"xxx",null);
		   Lesson l=b.new Lesson();
		   b.setLesson(l);
		   l.m2();
		   System.out.println(b);
		   ParentClass p=new ParentClass();
		   ParentClass.ChildClass ob=new ParentClass.ChildClass();
		
	}

}
