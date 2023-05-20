import java.util.*;

public class Negative_no_outside 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the element");
        int arr3[]= new int[5];

        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=sc.nextInt();
        }

        
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(" "+arr3[i]);
        } 
        
        int y;
        int temp=0;
       // Arrays.sort(arr3);
        
        for(int i=0;i<arr3.length;i++)
        {
            for(int j=0;j<arr3.length;j++)
            {
                if(arr3[i]<0)
                {
                    temp=arr3[j];
                    arr3[j]=arr3[i];
                    arr3[i]=temp;

                }
                
            }
        }
        System.out.println();
        
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(" "+arr3[i]);
        } 
        


    }    
}
