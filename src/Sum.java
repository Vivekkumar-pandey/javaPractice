public class Sum {
    public static void main(String[] args) {
        System.out.println("Sum Of Numbers : "+Sum(10,20));
    }
    public  static  int Sum(int ...a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return  sum;
    }
}
