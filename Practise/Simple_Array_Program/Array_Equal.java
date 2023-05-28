// Write a program to check whether two given Arrays are equal, given both contains same data type and same length ?

// To check whether two given arrays are equal or not , we can use Arrays.equals() method. Check the program below 

import java.util.Arrays;

public class Array_Equal
 {
    public static void main(String[] args) 
    {
       
        int[] a1 = { 1, 2, 3, 4, 5, 7, 8 };
        int[] a2 = { 1, 2, 3, 4, 5, 7, 9 };
    
        if(Arrays.equals(a1,a2))
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");


           //    Object [] arr={a1};
    //    Object []arr1={a2}; 
        // if (Arrays.deepEquals(arr, arr1))   
        // System.out.println("Arrays are equal.");   
        // else  
        // System.out.println("Arrays are not equal.");   
        

            
    }
}
