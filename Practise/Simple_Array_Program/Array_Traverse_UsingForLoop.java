public class Array_Traverse_UsingForLoop 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,6,7,8,9};
        
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }    
}
