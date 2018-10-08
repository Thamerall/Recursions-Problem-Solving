public class permutation {
    public static void main(String[] args) {
        String a = "123";
       perm("",a);
    }
    public static void perm(String pre , String s){
        int n = s.length();
        if (n == 0) System.out.println(pre);

        for(int i = 0 ; i < n  ; i++)

            perm(pre + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n));

    }
}
