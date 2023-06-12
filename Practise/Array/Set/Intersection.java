import java.util.ArrayList;
import java.util.Arrays;

public class Intersection
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Integer	arr1[] = {1, 3, 4, 5, 7,7};
	    Integer   arr2[] = {2, 3, 5, 6,7,7} ;
	    
	    
	    //ArrayList Allowed duplicate 
	    
	    
	    ArrayList<Integer> ArrayList1= new ArrayList<>();
	     ArrayList1.addAll(Arrays.asList(arr1));
	     
	     
	     ArrayList<Integer> ArrayList2= new ArrayList<>();
	     ArrayList2.addAll(Arrays.asList(arr2));
	     
	     
	     
	     ArrayList<Integer> intersection = new ArrayList<>(ArrayList1);
	     
	     intersection.retainAll(ArrayList2);
	    
	    
	    
	    
	    // Hash Set Not Allowe duplicate
	     
//	     Set<Integer> set1= new HashSet<Integer>();
//	     set1.addAll(Arrays.asList(arr1));
//	     
//	     
//	     Set<Integer> set2= new HashSet<Integer>();
//	     set2.addAll(Arrays.asList(arr2));
//	     
//	     
//	     
//	     Set<Integer> intersection = new HashSet<Integer>(set1);
//	     
//	     intersection.retainAll(set2);
	     
	     //System.out.println(intersection);
	     
	     for(Integer e: intersection)
	     {
	    	 System.out.println(e);
	     }
	}

}
