public class arrays_twoArraysEql {

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 1, 3, 5, 7};

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) {
                    System.out.println("Array are equals");
                    break;
                }
            }
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
}
