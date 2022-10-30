package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//find duplicate character in string
public class Duplicate {
    public static void findDuplicate(String str){
        char[] chars = str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (Character ch : chars){
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        Set<Map.Entry<Character, Integer>> entry = map.entrySet();
        for (Map.Entry<Character,Integer> entry1 : entry){
            if (entry1.getValue()>1)
            System.out.println(entry1);
        }

    }
    public static void main(String[] args) {

        String str  = "hello";
        findDuplicate(str);
    }
}
