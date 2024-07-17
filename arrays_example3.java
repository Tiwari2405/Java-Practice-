import java.util.Scanner;

public class arrays_example3 {
    public static void main(String args[]) {

        // it takes input from the user that is size of rows and columns using one
        // Scanner
        System.out.print("Enter the size of rows : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        System.out.print("Enter the size of column  : ");
        int columns = sc.nextInt();

        // we are taking here 2D aaray
        int arr[][] = new int[rows][columns];
        System.out.println("Enter the values of 2D array : ");

        // using nested loop one for row another for column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // printing all the values of array
        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
