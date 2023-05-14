


import java.util.Arrays;
import java.util.Scanner;
public class Sort_USing_Comparator {
public static void main(String[] args) 
{
// Create an object of Scanner class to accept array elements from the keyboard.
     Scanner sc = new Scanner(System.in);	
     System.out.println("How many elements do you want to enter?");   
     int size = sc.nextInt();

// Create an array to store Integer type elements or objects.
     Integer arr[ ] = new Integer[size];
     System.out.println("Enter your numbers:"); 
    for(int i = 0; i < size; i++)
    {
	 arr[i] = sc.nextInt();
     }
// Create an object of Ascend class.
     Descend ds = new Descend(); 
// Call sort() method of Arrays class to sort array elements in descending order.
     Arrays.sort(arr); //  for sorting into descending order.

// Display the sorted array elements.
     System.out.println("\nSorted in descending order: ");
      display(arr);
}  
 static void display(Integer arr[])
 {
    for(Integer element : arr)
    {
        System.out.println(element + "\t"); 
     }
  }
}