public class digitCount {
    public static void main(String[] args) {
        int a=243;
        int count =0;

//        for(int i =1;a>0;a/=10){
//            count++;
//        }

        while(a>0){
            a/=10;
            count++;
        }
        System.out.println(count);
    }
}
