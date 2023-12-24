class Solution {
    public String reverseWords(String s) {

        String[] myArray = s.trim().split(" ");
        String result = "";

        for(int i = myArray.length - 1; i >= 0; i--) {
           if (myArray[i] != "") {
            result = result + myArray[i] + " ";
            }
        }
        return result.trim();     
    }
}
