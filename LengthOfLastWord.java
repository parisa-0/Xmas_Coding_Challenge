class Solution {
    public int lengthOfLastWord(String s) {

         return s.trim().length()-s.trim().lastIndexOf(" ")-1;

        /*
        String[] myArray = s.trim().split(" ");
        int result = myArray[myArray.length - 1].length();

        return result;
        */
    }
}
