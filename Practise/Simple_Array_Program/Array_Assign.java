// There are two arrays object one containing 100 elements and another containing 50 elements. Both are of same data type. Can we assign one Array to another Array.

public class Array_Assign 
{
    public static void main(String[] args) 
    {
    int[]  arr1 = new int[50];
    int[]  arr2 = new int[100];
    arr1 = arr2;
    System.out.println(arr1.length); 
    }    
}
