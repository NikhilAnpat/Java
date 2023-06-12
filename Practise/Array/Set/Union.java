import java.util.HashSet;
import java.util.Iterator;

public class Union
{
	public static void main(String[] args)
	{
	int	arr1[] = {1, 3, 4, 5, 7};
     int   arr2[] = {2, 3, 5, 6,7} ;
        
        HashSet<Integer> h = new HashSet<>();
        
        for(int i=0;i<arr1.length;i++)
        {
        	h.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
        	h.add(arr2[i]);
        }
        
     
      //h.forEach(a->{Systemout.println(a);}); //1
        
      
//        Iterator itr = h.iterator();//2
//        while (itr.hasNext()) {
//           System.out.println(itr.next());

	   for(Integer e : h)//3
	   {
		   System.out.println(e);
	   }
		   
	}
        
	}
	

