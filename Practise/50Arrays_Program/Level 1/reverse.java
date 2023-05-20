import java.util.Scanner;

public class reverse
{

    void app(int arr1[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
    }

    void doCal(int arr1[],int s)
    {
        for(int i=arr1.length-1;i>=0;i--)
        {
           System.out.print(" "+arr1[i]);
        }
    }

    void dis(int arr1[])
    {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(" "+arr1[i]);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size =sc.nextInt();
        
        int arr1[]= new int[size];
        
        reverse rr = new reverse();


        rr.app(arr1);
        System.out.print("Array of element:");
        rr.dis(arr1);
      //
      System.out.print("\nReverse Array is:");
        rr.doCal(arr1,size);

    }    
}
