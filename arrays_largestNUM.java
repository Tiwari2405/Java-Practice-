public class arrays_largestNUM {
    public static void main(String args[]) {
        int arr[] = { 45, 67, 89, 10, 34 };

        // take first index as maximum number
        int max = arr[0];

        // compare each index value in the array with your maximum value and store in
        // the maximum variable.
        // we can also use this---------  int max = Arrays.stream(arr).max().getAsInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The largest number in this array is : " + max);
    }
}
