import java.util.Scanner;

public class Ascending 
{
	int temp=0;
	void Accept(int a[],int size)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

	}
	
	void Calculation(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0+i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
							
				}
			}
		}
	}
	
	void Show(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print( " "+a[i]);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size:");
		int size =sc.nextInt();
		int arr[]=new int[size];
		
		Ascending a= new Ascending();
		
		a.Accept(arr,size);
		a.Show(arr);
		a.Calculation(arr);
		System.out.println("\n Ascending order is :");
		a.Show(arr);

		
	}
}
