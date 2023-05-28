// Write a program to sort an Array in Java ?
// You do not need to write quick sort or merge sort algorithm in order to sort an Array. You can sort an Array by using Arrays.sort() method. Check out the program below :



public class Array_Sort 
{
    public static void main(String[] args) 
    {
        int arr[]={12,45,676,23,89,4,32,23,56};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }


        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i];
        }

        for(int i=0;i<arr.length;i++)
        {
            System.err.print(" "+arr[i]);
        }
    }    
}
