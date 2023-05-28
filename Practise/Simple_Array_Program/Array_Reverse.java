// How to reverse an Array in java ? (solution)

// You will find this type of questions during telephonic round of interview or early rounds of face to face interview. Make sure you go through this question before appearing for the interview.


public class Array_Reverse 
{
    public static void main(String[] args) {
        

        int arr[]={1,2,3,4,5,6,7,89,5,43,1};


        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(" " +arr[i]);
        }
    }    
}
