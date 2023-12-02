import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    /*
    https://leetcode.com/problems/isomorphic-strings/
    Given two strings s and t, determine if they are isomorphic.
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    All occurrences of a character must be replaced with another character while preserving the order of
    characters. No two characters may map to the same character, but a character may map to itself.
    */
    /*
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if(!map.containsKey(s.charAt(i))) {
                    map.put(t.charAt(j), s.charAt(i));
                }
                else if(map.containsKey(t.charAt(j))) {
                    map.put((char) (t.charAt(j) + t.charAt(j)), s.charAt(i));
                }
                i++;
            }
        }

 */

    public static void main(String[] args) {

        String s = "foo";
        String t = "bar";
        String result = "";

        Map<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(j));
                    i++;
                }
               else if (!map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(j));
                    i++;
                } else if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)));
                    i++;
                }
            }
        }


        HashMap<Character, Character> nonDuplicateMap = new HashMap<>();


        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            Character key = entry.getKey();
            Character value = entry.getValue();

            if (!nonDuplicateMap.containsValue(value)) {
                nonDuplicateMap.put(key, value);
            }
        }

        for(int k = 0; k < s.length(); k++) {
            if(nonDuplicateMap.containsKey(s.charAt(k))) {
                result = result + nonDuplicateMap.get(s.charAt(k));
            }
        }

        System.out.println(result.equals(t));

    }
}
