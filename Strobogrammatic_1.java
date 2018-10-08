import java.util.HashMap;
import java.util.Map;

public class Strobogrammatic_1 {
    public static void main(String[] args) {

        System.out.println(Strobogr("11"));
    }
    public static boolean Strobogr(String a ){
        Map<Character,Character> map = new HashMap<>();
        map.put('6','9');
        map.put('9','6');
        map.put('0','0');
        map.put('8','8');
        map.put('1','1');
        int l = 0 , r = a.length()-1;
        while (l <= r){
            if(!map.containsKey(a.charAt(l))) return false;
            if (map.get(a.charAt(l))!= a.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;

    }
}
