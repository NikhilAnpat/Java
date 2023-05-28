// Given two arrays, find the intersection between them? (solution)

// Intersection means common elements. We need to find common elements between two given arrays.
// For example :
// int[]  arr1 = {1, 2, 3, 4, 5, 6};
// int[] arr2 = {2, 3, 4, 7, 8};
// Output : 2, 3, 4




public class Array_Intersection 
{
    public static void main(String[] args) 
    {
        int arr[]= {1,2,3,4,5,6};
        int arr1[]={2,3,4,7,8};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr[i]==arr1[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }    
}
