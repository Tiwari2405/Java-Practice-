public class arrays_add2Matrices {
    public static void main(String args[]) {

        int rows = 2;
        int column = 2;

        int arr1[][] = { { 1, 2 }, 
                         { 2, 3 } };

        int arr2[][] = { { 2, 0 }, 
                         { 2, 3 } };

        int arr3[][] = new int[2][2];

        //loop for adding matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                arr3[i][j] = arr1[i][j] + arr2[j][j];
            }
        }

        //printing result f the matrix
        System.out.println("Resultant matrix are: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
