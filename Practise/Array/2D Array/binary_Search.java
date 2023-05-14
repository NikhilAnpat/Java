
import java.util.Arrays;
public class binary_Search {
public static void main(String[] args) 
{
// Creating a sorted array of int and char types.	
//    int[ ] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
//    System.out.println("1. Index of element 11 is " + Arrays.binarySearch(list, 11));
//    System.out.println("2. Index of element 12 is " + Arrays.binarySearch(list, 12));
//	
//    char[ ] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
//    System.out.println("3. Index of element 'a' is " + Arrays.binarySearch(chars, 'a'));
//    System.out.println("4. Index of element 't' is " + Arrays.binarySearch(chars, 't'));
//  
// Creating unsorted array.
     int[ ] num = {25, 35, 10, 45, 20, 30};
     Arrays.sort(num); // Sorting array. 
     System.out.println("5. Index of element 45 is " +Arrays.binarySearch(num, 45));
  }
}
