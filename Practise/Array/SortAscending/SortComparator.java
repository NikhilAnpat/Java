import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class SortComparator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");

        int size = sc.nextInt();

        Integer arr[] = new Integer[size];

        System.out.println("Enter your numbers");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Define a custom comparator for ascending order
        Comparator<Integer> ascendComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a.compareTo(b);
            }
        };

        Arrays.sort(arr, ascendComparator);

        System.out.println("\nSorted in Ascending order: ");

        display(arr);

        sc.close(); // Close the Scanner
    }

    static void display(Integer arr[]) {
        for (Integer element : arr) {
            System.out.println(element);
        }
    }
}
