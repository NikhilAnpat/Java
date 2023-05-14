
public class JaggedArray
{
     public static void main(String[] args) 
     {	
//		int[ ][ ]  arr = {
//                           {11, 12, 13, 14, 15},
//                           {7, 8, 9, 10},
//                           {4, 5, 6},
//                           {2, 3},
//                           {1}
//                               };
//		
//		System.out.println(arr);
    	 
    	 
    	 
    	 
    	 int[ ][ ] arr = new int[5][ ];
    	  arr[0] = new int[5];
    	  arr[1] = new int[4];
    	  arr[2] = new int[3];
    	  arr[3] = new int[2];
    	  arr[4] = new int[1];
    	  
    	  
    	  arr[0][3] = 90;
    	  arr[4][0] = 75;
    	  
    	  
    	  System.out.println(arr[0][3]+" "+arr[4][0]);
	}
}
