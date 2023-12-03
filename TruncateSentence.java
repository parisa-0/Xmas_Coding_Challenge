class Solution {
    public String truncateSentence(String s, int k) {
       // str.split(" ")
       //Then put in array
       //print based on k

        String[] myArray = s.split(" ");
        String result = "";

        for(int i = 0; i < k;i++) {
            result = result + myArray[i] + " ";
        }

        return result.trim();

    }
}
