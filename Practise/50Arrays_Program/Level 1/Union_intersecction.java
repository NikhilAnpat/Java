import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.Scanner;

public class Union_intersecction 
{

    void Accept1(int a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element array");
        
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
    }


    void intersection(int a1[],int a2[])
    {
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                    System.out.println("\n Intersection is:"+a1[i]);
                }
            }
        }

       
    }


    
    void union(int arr1[],int arr2[])
    {   
        
    }


    void show1(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array 1 :");
        Integer size1=sc.nextInt();
        System.out.println("Enter the size of array 2 :");
        int size2=sc.nextInt();


        Integer a1[]=new Integer[size1];
        Integer a2[]=new Integer[size2];

        HashSet<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(a1));
        set.addAll(Arrays.asList(a2));

        Integer[] union = {};
        union = set.toArray(union);



        // Array.Sort(a1);
        // Arrays.sort(a2);

        Union_intersecction ui = new Union_intersecction();
        
        ui.Accept1(a1);
        ui.Accept1(a2);
        System.out.print("Array 1:");



        ui.show1(a1);
        System.out.println();
        System.out.print("Array 2:");   
        ui.show1(a2);
    

        // ui.intersection(a1,a2);
      //  ui.union(a1, a2);
      //  ui.intersection(a2);
        // ui.show1(a);
        System.out.println();
        ui.union(a1, a2);

        
    }
}