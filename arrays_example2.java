import java.util.*;
public class arrays_example2 {
    public static void main(String args []){
        
        System.out.print("Enter the size of an array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        System.out.println("Enter the values in array: ");
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The values in the array are : ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}