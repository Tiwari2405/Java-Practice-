public class arrays_example1 {
    public static void main (String args []){
        int arr[] = new int[3];
        arr[0] = 1;
        arr[1] = 6;
        arr[2] = 9;

        //for printing any single value using index number
        System.out.println("The value of array at index 2 is : " + arr[2]);

        //printing whole array value using for loop
        System.out.print("The value in Array are: ");
        for(int a=0; a<3; a++){
            System.out.print(arr[a] + " ");
        }
    }
}
