public class UsingForLoop
 {
    public static void main(String[] args) 
    {
        int arr[]={4,10,14,44,99,108,3,1,0,5,-1};    

        System.out.print("This is orignal Array :");
        for(int a:arr)
        {
            System.out.print(a+",");
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp=0;
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();

         System.out.print("This is Sorted Array :");
        for(int a:arr)
        {
            System.out.print(a+",");
        }
    }    
}
