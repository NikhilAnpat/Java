
import java.util.Arrays;
public class CompareArraysExample {
public static void main(String[ ] args) 
{
// Creating arrays of int type.	
     int[ ] num1 = {1, 2, 3, 4, 5};
     int[ ] num2 = {1, 2, 7, 4, 5};
    int[ ] num3 = {1, 2, 3, 4, 5};

// Comparing both arrays lexicographically. 
     System.out.println("\nComparing arrays using compare method:")  ;   
     System.out.println("Arrays.compare(num1, num2): " +Arrays.compare(num1, num2));
     System.out.println("Arrays.compare(num2, num1): " +Arrays.compare(num2, num1));
    System.out.println("Arrays.compare(num1, num3): " +Arrays.compare(num1, num3));
  }
}
