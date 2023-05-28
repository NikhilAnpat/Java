//How do you separate zeros and non-zeros in a given Array in java?

import java.util.Arrays;

public class Array_Seprate_NOnzero
{
    public static void main(String[] args) 
    {
        
        int arr[]={0,1,2,3,4,5,1,0,212,0};

        int count=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] !=0)
            {
                arr[count]=arr[i];
                count++;
            }
        }

        while(count<arr.length)
        {
            arr[count]=0;
            count++;
        }
        System.out.println(Arrays.toString(arr));



    }
}