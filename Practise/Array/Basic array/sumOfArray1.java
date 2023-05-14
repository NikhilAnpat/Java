import java.util.Scanner;

public class sumOfArray1 
{
	
	int sum=0;
	void accept(int a[],int size)
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.println("enter the element:"+size);

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("The toal element is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("["+a[i]+"]");
		}

		
	}
	
	
	void sum(int a[])
	{
		
		for(int i=0;i<a.length;i++)
		{
			
			sum=sum +a[i];
		}
		
		System.out.println("Total sum is="+sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element size");
		int size=sc.nextInt();
		int arr[]=new int [size];
		
		sumOfArray1 s=new sumOfArray1();
		
		s.accept(arr,size);
		s.sum(arr);
		

	}

}
