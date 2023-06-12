import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Differnce 
{
	public static void main(String[] args) 
	{
		Integer	arr1[] = {1, 3, 4, 5, 7};
	     Integer   arr2[] = {2, 3, 5, 6,7} ;
	        
	     Set<Integer> s1 =new HashSet<>();
	     s1.addAll(Arrays.asList(arr1));
	     
	     Set<Integer> s2 =new HashSet<>();
	     s2.addAll(Arrays.asList(arr2));
	     
	     Set<Integer> s3 =new HashSet<>(s1);
	     s3.removeAll(s2);
	     
	     for(Integer e:s3)
	     {
	    	 System.out.println(e);
	     }

	     
	}
}
