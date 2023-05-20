import java.util.*;

class Max_Min_Array
{
    void Accept(int arr[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

    }

    void cal(int arr[])
    {
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        
        System.out.println("\nMaximum number is:"+max);
        System.out.println("Minimum number is:"+min);
    }

    void show(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }


public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array");   
    int size = sc.nextInt();
    int arr []= new int[size];

   Max_Min_Array a= new Max_Min_Array();

    a.Accept(arr);
    a.show(arr);
    a.cal(arr);

}
}