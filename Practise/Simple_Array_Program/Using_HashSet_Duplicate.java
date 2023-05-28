import java.util.*;
public class Using_HashSet_Duplicate 
{
    public static void main(String[] args) 
    {

        //    Integer arr1[]={1,2,3,5,6,7,8,4,2,4,5}; 
           
        //    HashSet<Integer> set = new HashSet<Integer>();

        //     for (Integer val : arr1)
        //     {
        //         if (set.add(val) == false){
        //             System.out.print (val+" ");
        //         }
        //     }


        String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };
        HashSet<String> set = new HashSet<String>();
        
        for (String val : arr1)
        {
            if (set.add(val) == false){
                System.out.print (val+" ");
            }
        }
            
        

          
    }    
}
