package String;

import java.util.Arrays;

//Check if two Strings are anagrams of each other
//to solve it  just yot need to check if equal contains of two strings
public class Anagram {
    public static boolean isAnagram(String a,String b){
        if (a.length() != b.length()){
            return false;
        }
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars,bChars);
    }
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        System.out.println(isAnagram(a,b));
    }
}
