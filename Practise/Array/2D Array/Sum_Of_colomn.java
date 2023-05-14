import java.util.Scanner;

public class Sum_Of_colomn 
{
	int sum=0;
	int k;
	void accept(int a[][],int s1,int s2)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element :");
		
		for(int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	void sum(int a[][],int s1,int s2)
	{
		
//		//Total sum of element
//		for(int i=0;i<a.length;i++)
//		{				
//			for(int j=0;j<a[i].length;j++)
//			{
//				sum=sum+a[i][j];
//			}
//		}
//		
//		System.out.println("Total sum is :"+sum);
//		
		
		
		
		// Calculate the sum of colomn
		
		   for (int j = 0; j < s2; j++) 
		   {
			 int total = 0;
			 
			 for (int i = 0; i < s1; i++)
			 
			   total =total + a[i][j];
			   System.out.println("Sum of elements in column " + j + " is " + total);
		   
			 
		   } 
		
	}
	
	void show(int a[][],int s1,int s2)
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
		System.out.println("Enter the Size 1 :");
		int size1=sc.nextInt();
		System.out.println("Enter the Size 2 :");
		int size2=sc.nextInt();
		
		int arr2[][]= new int[size1][size2];
		
		Sum_Of_colomn s = new Sum_Of_colomn();
		
		s.accept(arr2, size1, size2);
		System.out.println("Array is:"+size1+" * "+size2 );
		s.show(arr2,size1,size2);
		s.sum(arr2, size1, size2);
		
		


	}

}
