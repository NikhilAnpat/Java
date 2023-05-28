//How to find the missing number in a given Array from number 1 to 100
class Array_Missing
{
    public static void main(String[] args) 
    {   
        int arr[]={1,2,3,4,5,7,8,9};//store element 1 to 100
        int n=arr.length+1;
        int sum1=n*(n+1)/2;
        int sum2=0;
        int k=0;

        for(int i=0;i<arr.length;i++)
        {
            sum2=sum2+arr[i];
            k=sum1-sum2;
        }
        System.out.println("Missing number is : "+k);


    }   
}
