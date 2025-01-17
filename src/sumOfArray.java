public class sumOfArray {
    public static void main(String[] args) {
        int [] a = {3,2,5,10,25};
        System.out.println("Sum " +
                "of Array Is : "+getSum(a));
    }

    public static  int getSum(int[] n){
        int sum = 0;
        for(int i:n){
            sum=sum+i;
        }
        return sum;
    }
}
