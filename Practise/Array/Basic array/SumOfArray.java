import java.util.Scanner;

public class SumOfArray
{
	public static void main(String[] args) 
	{
		int sum[]=new int[5];
		
		System.out.println("enter the element:"+sum.length);
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the element");
		int addition=0;
		
		for(int i=0;i<sum.length;i++)
		{
			sum[i]=sc.nextInt();
		}
		
		for(int i=0;i<sum.length;i++)
		{
			System.out.println("the index is: "+i+" element is: "+sum[i]);
		}
		
		
		for(int i=0;i<sum.length;i++)
		{
			addition = addition + sum[i];
			
		}
		System.out.println("total sum of element is="+addition);
		
		for(int i=0;i<sum.length;i++)
		{
			addition=addition +sum[i];
		}
		
	}
}
