import java.util.Scanner;

public class Percentage
{   int sum=0;
	void Accept(int a[],int size)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks"+size);


		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	

	
	void show(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Marks Obtain "+(i+1)+"sub:"+a[i]);
		}
	}
	
	void calculation(int a[],int size)
	{
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		float average=(float) sum/size;
		System.out.println("The percentage is"+average+"%");
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sub :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		Percentage p=new Percentage();
		
		p.Accept(arr,size);
		
		p.show(arr);
		p.calculation(arr,size);
	}

}
