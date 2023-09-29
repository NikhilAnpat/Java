import java.util.Arrays;

public class SortArray 
{
    public static void main(String[] args)
    {
        int arr[]={4,10,14,44,99,108,3,1,0,5,-1};
        
       Arrays.sort(arr);
        for(int b:arr)
        {
            System.out.println(b);
        }
    }    
}
