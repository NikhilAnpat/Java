import java.util.Scanner;

public class Negibours_samller
{

    static int findPeak(int arr[], int n)
    {
        // First or last element is peak element
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
            return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
        // Check for every other element
        for (int i = 1; i < n - 1; i++) {
            // Check if the neighbors are smaller
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
                return i;
        }
        return 0;
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int a[]=new int[6];
        int n=a.length;


        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("Index of a peak point is " + findPeak(a, n));


        // for(int i=0;i<a.length;i++)
        // {
        //     for(int j=0+i;j<a.length;j++)
        //     {
        //         if(a[i]<a[j] && a[i]>a[j])
        //         {
        //             System.out.print(a[i]);
        //         }
        //     }
        // }


        }   
}

