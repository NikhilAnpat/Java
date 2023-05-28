//Write a program to search a specific element in an Array?

// You can use binarySearch(int[], int) method. This method internally uses binary search algorithm.
// It is prerequisite for binary search algorithm to have elements sorted. In the given example I have taken an already sorted Array



import java.util.Arrays;
import java.util.Scanner;

public class Array_Search_Specific_Element
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,7,8,9};

        //System.out.println(Arrays.binarySearch(arr,9));


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to find the number in array");
        int n=sc.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                int k=arr[i];

                System.out.println(k-1);
            }
        }
    }
}