public class Fib_Sequence {
    public static void main(String[] args) {
        int a = 3;
        System.out.println(fib(0));

    }
    public static int fib (int n ){
        if(n <= 1) return n;
        else {
           return fib(n-1)+ fib(n-2);
        }
    }
}
