class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> myList = new LinkedList<>();

        for(int i = 0; i < words.length; i++) {
            if(words[i].contains(x + "")) {
                myList.add(i);
            }
        }
        return myList;
    }
}
