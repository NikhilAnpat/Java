import java.util.Scanner;

public class Array_2dPrint
{
    public static void main(String[] args) 
    {
        int arr[][]=new int [3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the element: ");
     //   int a=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
       

        
        
        
    }

}