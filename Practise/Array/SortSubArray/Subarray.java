import java.util.*;
public class Subarray
{
    public static void main(String[] args) 
    {
        int a[]={5,8,2,4,9,1,7,3,0,11};
        
        Arrays.sort(a,2,8);
        for(int z: a)
        {
            System.out.print(z+"   ");
        }
    }
}