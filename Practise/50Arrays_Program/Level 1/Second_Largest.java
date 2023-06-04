import java.util.Arrays;

public class Second_Largest 
{
	
	public void SecondLargest(int a[]) 
	{	
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				temp=max;
				max=a[i];
				smax=temp;
			}
			else if(a[i]>smax && a[i] !=max)
			{
				smax=a[i];
				
			}
			
		}
		
		  if (smax == Integer.MIN_VALUE) 
		  {
	            System.out.println("No Second Highest value");
	        } else 
	        {
	            System.out.println(smax);
	        }
		  
		
		
		
	}
	
	
	public static void main(String[] args) 
	{
		int arr[]= {12, 35, 1, 10, 34, 1};
		
		Second_Largest sl=new Second_Largest();
		sl.SecondLargest(arr);
	}

}
