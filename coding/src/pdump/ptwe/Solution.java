package pdump.ptwe;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s,t) );
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        //HashSet<Character> is
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                System.out.println(map);
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                System.out.println(map);
                map.put(s.charAt(i), t.charAt(i));
            }
        }
       /* Map<Character, Character> two = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
            }else{
                map.put(t.charAt(i), s.charAt(i));
            }
        }*/
        return true;
    }
}
