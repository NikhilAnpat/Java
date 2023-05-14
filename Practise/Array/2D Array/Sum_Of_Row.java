import java.util.Scanner;

public class Sum_Of_Row 
{
	int sum=0;
	
	void Dec(int a[][],int s1,int s2)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element :");
		
		for(int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	
	void sum1(int a[][],int s1,int s2)
	{
		
		for(int i=0;i<s1;i++)
		{	int sum=0;
			for(int j=0;j<s2;j++)
			
				
				sum=sum+a[i][j];
				
				System.out.println("The Row is :"+ i+" sum is : "+sum);
			
		}
		
	}
	
	void Display1(int a[][],int s1,int s2)
	{
		for(int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size1");
		int size1=sc.nextInt();
		System.out.println("Enter the size2");
		int size2=sc.nextInt();
		
		int arr3[][]=new int [size1][size2];
		
		Sum_Of_Row s1= new Sum_Of_Row();
		
		s1.Dec(arr3,size1,size2);
		s1.Display1(arr3, size1, size2);
		s1.sum1(arr3, size1, size2);
		System.out.println();
		
	}

}
