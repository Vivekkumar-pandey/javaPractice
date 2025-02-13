public class reverseString {
    public static void main(String[] args) {
        String str ="Hello Vivek!! How are you?";

     //   System.out.println(reverseUsingRecursion(str));
     //   System.out.println(reverseString(str));
     //   System.out.println(reverseUsingChar(str));
          System.out.println(reverseUsingStringBuilder(str));

    }

       //using for loop
//        public static String reverseString(String str) {
//        System.out.println("Using For Loop");
//                   String rev="";
//       for(int i = str.length() - 1; i >= 0; i--){
//           rev += str.charAt(i);
//              }
//       return rev;
//        }

    // Using Recursion
//    public static String reverseUsingRecursion(String str){
//    System.out.println("Using Recursion");
//        if(str.isEmpty()) {
//            return str;
//        }
//        return reverseUsingRecursion(str.substring(1))+str.charAt(0);
//    }

    //Using Char[]
//    public static String reverseUsingChar(String str){
//        System.out.println("Using For Char[] ");
//        char[] ch = str.toCharArray();
//        String rev = "";
//        for (int i = ch.length-1; i >= 0; i--){
//            rev += ch[i];
//        }
//        return rev;
//    }

    public static String reverseUsingStringBuilder(String str){
        System.out.println("Using StringBuilder");
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse;
    }
}
