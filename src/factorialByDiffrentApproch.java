public class factorialByDiffrentApproch {

        public static void main(String[] args) {
            int value = getFactorial(7);
            System.out.println("Factorial is : "+value);
        }
        public static int getFactorial(int x){

            // Normal *****************************

            // int fact = 1;
            // int i=1;
            // while(i<=x){
            //     fact = fact*i;
            //     i++;
            // }
            // return fact;

            // Using recursion **********************

            //if(x>0)
            //return (x * getFactorial(x-1));
            //else
            //return 1;

            // Using Ternary operator

            return (x>0?(x*getFactorial(x-1)):1);

        }
    }
