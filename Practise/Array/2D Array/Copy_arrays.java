
public class Copy_arrays 
{
public static void main(String[] args) 
{
   int[ ] originalArray = {2, 3, 4, 5, 6, 7};
   
// Create an array newArray[] of same size as originalArray[].
   
   int[ ] newArray = new int[originalArray.length];
// Copy array elements from originalArray[] into newArray[].  
   
   for (int i = 0; i < originalArray.length; i++) 
   
	   newArray[i] = originalArray[i];
 
   
   System.out.println("Elements of originalArray[]: ");
   
   for (int i = 0; i < originalArray.length; i++)
   
	   System.out.print(originalArray[i] + " ");

   System.out.println("\n\nElements of newArray[]: ");
   
   for (int i = 0; i < newArray.length; i++)
   
	   System.out.print(newArray[i] + " ");
 }
}