
public class Second_Lowest {

	public static void main(String[] args) 
	{
		int a[]= {34,35,36,99,100,101,22,21,12,21};
		int min=a[0];
		int temp;
		int smin=Integer.MIN_VALUE;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				temp=min;
				min=a[i];
				smin=temp;
			}
			else if(a[i]<smin && a[i] !=min)
			{
				smin=a[i];
			}
			
		}
		System.out.println("Second Smallest Number : "+smin);
	}

}
