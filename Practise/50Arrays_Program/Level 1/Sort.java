import java.util.Scanner;

public class Sort
{
    void acce(int arr5[])
    {
        Scanner sc = new  Scanner(System.in);

        for(int i=0;i<arr5.length;i++)
        {
            arr5[i]=sc.nextInt();
        }
    }   
    
    void docal(int arr5[])
    {
        int temp=0;

      for(int i=0;i<arr5.length;i++)
      {
        for(int j=0+i;j<arr5.length;j++)
        {
            if(arr5[i]>arr5[j])
            {
                temp=arr5[j];
                arr5[j]=arr5[i];
                arr5[i]=temp;
            }
        }
      }  
    }

    void doprint(int arr5[])
    {
        for(int i=0;i<arr5.length;i++)
        {
            System.out.print(" "+arr5[i]);
        }
    }

public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the array size");
    int size=sc.nextInt();
    int arr5[]=new int[size];

    Sort ss= new Sort();

    ss.acce(arr5);
    ss.doprint(arr5);
    ss.docal(arr5);
    System.out.println();
    ss.doprint(arr5);

    
}
}
