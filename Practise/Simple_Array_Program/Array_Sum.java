//Write a program to sum all the values of a given Array in java?

public class Array_Sum 
{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        // using for loop
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Total addition of array element is : "+sum);


        // using for each loop
        int res=0;
        for(int number:arr)
        {
            res +=number;   
        }

        System.out.println("Total addition of array element is : "+res);
    }    
}
