public class biggestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,76,98,5667, 34, 66};

        int result = Integer.MIN_VALUE;
//
        // Using For Each loop ........

//        for (int i : arr){
//            if (i>result){
//                result = i;
//            }
//        }

        // Using For loop ........

        for (int i=0; i<arr.length;i++){
            if (arr[i]>result){
                result = arr[i];
            }
        }

        System.out.println("Biggest Number In this array is : "+result);
    }
}
