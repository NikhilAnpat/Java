
// 1 2 3
// 4 5 6
// 7 8 9


import java.util.Scanner;

public class Display
{
	
	void Dec(int a[][],int s1,int s2)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		
		for(int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	
	void dis(int a[][],int s1,int s2)
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
		System.out.println("Enter the ROW size");
		int size1 = sc.nextInt();
		System.out.println("Enter the Colomn size");
		int size2 = sc.nextInt();
		int arr2[][]= new int[size1][size2];
		
		Display t = new Display();
		
		t.Dec(arr2,size1,size2);
		t.dis(arr2,size1,size2);
	}

}