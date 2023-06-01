package Test;

public class ParentClass 
{
	private int pnum;
	private static int count=0;
	
	
	static class ChildClass
	{
		public void m1()
		{
			//System.out.println(pnum);
			System.out.println("Count : "+count);
		}
	}
}
