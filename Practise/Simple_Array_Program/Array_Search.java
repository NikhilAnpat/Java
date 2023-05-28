import java.util.Scanner;

public class Array_Search 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element are search in array: ");
        int key=sc.nextInt();
        

        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]==key)
           {
            System.out.println("Element are found in array: "+key);
           }
          
           
        }
        
        


    }    
}
