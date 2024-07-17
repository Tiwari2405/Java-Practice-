import java.util.*;

public class arrays_example2 {
    public static void main(String args[]) {

        // takes input from the user that what array size should they want store in size
        // variable
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // it takes input from the user of arrays value and store one by one using loop
        // at each index
        System.out.println("Enter the values in array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // printing tha values of array using loop
        System.out.print("The values in the array are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}