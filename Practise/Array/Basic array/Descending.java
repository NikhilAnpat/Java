import java.util.Scanner;

public class Descending 
{	
	int tmp=0;
	void Acce(int a[],int size)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements ia:"+size);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	void Cal(int a[]) 
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0+i;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}
	}
	
	void Dis(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size =sc.nextInt();
		int arr1[]=new int[size];
		
		Descending d= new Descending();
		
		d.Acce(arr1, size);
		System.out.print("Element is:");
		d.Dis(arr1);
		d.Cal(arr1);
		System.out.print(" \nDescending order is:");
		d.Dis(arr1);
	}
}
