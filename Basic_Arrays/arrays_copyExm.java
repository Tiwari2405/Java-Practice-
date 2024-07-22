import java.util.*;

public class arrays_copyExm {
    public static void main(String args[]) {

        int arr1[] = { 4, 6, 8, 9 };

        // int[] copyArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println(Arrays.toString(arr1));
    

        int arr2[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //printing original array value
        System.out.print("Value in original array is : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        // printing copy Array
        System.out.print("Value in copied Array is : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
