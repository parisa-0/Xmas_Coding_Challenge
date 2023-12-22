class Solution {
    public boolean isAnagram(String s, String t) {
               Map<Character,Integer> myMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            myMap.put(s.charAt(i), myMap.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int j = 0; j < t.length(); j++) {
            myMap.put(t.charAt(j), myMap.getOrDefault(t.charAt(j), 0)-1);
        }

        for (Integer value : myMap.values()) {
            if(value != 0) {
                return false;
            }
        }
        return true;
    }
}
