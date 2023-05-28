//Find out smallest and largest number in a given Array?

public class Array_Max_Min 
{
    public static void main(String[] args) {
        
        int arr[]={101,2,5,56,65,6,543,56,443,4,4334,34,3,45,5};

        //using for each loop

        // int max=arr[0];
        // int min=arr[0];

        // for(int number :arr)
        // {
        //     if(number>max)
        //     {
        //         max=number;
        //     }
        //     else if(min >number)
        //     {
        //         min =number;
        //     }

        // }

        //  System.out.println("Smallest & Largest number is :"+max+" "+min);


        //using for loop

        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("Smallest & Largest number is :"+max+" "+min);

     
    }    
}
