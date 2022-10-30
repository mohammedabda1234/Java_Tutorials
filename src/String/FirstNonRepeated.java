package String;
// first non-repeated character
import java.util.HashMap;

public class FirstNonRepeated {
    public static char getFirstNonRepeated(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1)
                return c;
        }
        throw new RuntimeException("no answer");
    }
    public static void main(String[] args) {

        String str = "ice cream";
        System.out.println(getFirstNonRepeated(str));
    }
}
