public class reverseTheArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5, 78, 98, 4, 90, 75, 9};

        // Array Print

        System.out.println("************ Print Array **************");
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("************ Reverse Array **************");

        // Reverse Array

        for (int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
