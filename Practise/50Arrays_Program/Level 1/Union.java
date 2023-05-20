import java.util.*;
public class Union{

   //main method
   public static void main(String[] args){
   
      //Declare and initialize the first array elements
      Integer arr1[] = { 0, 5, 11, 7, 9, 3};
      
      //Declare and initialize the second array elements
      Integer arr2[] = { 1, 2, 4, 5, 12, 7 };
      union(arr1, arr2);
   }
   
   //user defined method
   public static void  union(Integer []arr1, Integer []arr2){
   
      //Initialize Hashset to perform union operation
      HashSet<Integer> set = new HashSet<>();
      
      //add first array to set
      set.addAll(Arrays.asList(arr1));
      
      //add second array to set
      set.addAll(Arrays.asList(arr2));
      
      //convert to array from set
      Integer[] union = {};
      union = set.toArray(union);
      
      //print the result
      System.out.println("Union of two arrays is: " + Arrays.toString(union));
   }
}