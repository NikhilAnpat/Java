// Write a program to throw ArrayOutOfBoundsException?
// Output:
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
//     at JavaHungry.main(JavaHungry.java:8)


public class Array_OutOfBond 
{
    public static void main(String[] args) 
    {
        int arr[]=new int[]{1,2,3,6,4,3,4,5,5};
        
        for(int i=0;i<=arr.length;i++)
        {
            arr[i]=arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }    
}
