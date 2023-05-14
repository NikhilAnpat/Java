import java.util.Scanner;

public class DisplayArray 
{

	void Accept(int a[],int size)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element:"+size);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	void Show(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
		System.out.print(" "+a[i]);
		}
		System.out.println("\n The lengthof array is:"+a.length);
	}
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		DisplayArray s= new DisplayArray();
		
		s.Accept(arr,size);
		s.Show(arr);
		
	}

}
