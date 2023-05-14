import java.util.Scanner;

public class Percentage
{
	void acc1(String a[],int s1)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name:");
		
		for(int i=0;i<s1;i++)
		{
			a[i]=sc.next();
		}
	
	}
	
	
	
	
	void marks(int a[][],int s1,int s2)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Marks :");
		
		for(int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	
	void per()
	{
		
	}
	
	void dis1(String a[],int s1)
	{

		for(int i=0;i<s1;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Total Student:");
		int strSize=sc.nextInt();
		
		
		String str[]=new String [strSize];
		
		System.out.println("Enter the How many subject:");
		int size1 =sc.nextInt();
		System.out.println("Enter the How many subject:");
		int size2 =sc.nextInt();
		int arr11 [][]= new int [size1][size2];
		
	 
		
		Percentage p= new Percentage();
		
		p.acc1(str,strSize);
		p.dis1(str,strSize);
		p.marks(arr11, size1, size2);
		
		
		
	}

}
