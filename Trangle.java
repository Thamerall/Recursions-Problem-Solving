public class Trangle {
    public static void main(String[] args) {
        int a = 4;


        System.out.println(trangle(1000));
    }

    // (n^2 + n) / 2
    public static int trangle(int n ){
        if (n == 1) return 1;

        return n + trangle(n-1);
    }
}
