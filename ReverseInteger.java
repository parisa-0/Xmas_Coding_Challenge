import java.math.BigInteger;
class Solution {
    public int reverse(int x) {
        
        String temp = Integer.toString(x);
        int[] storeNumbers = new int[temp.length()];
        String finalResult = "";

        for(int i = temp.length() - 1; i >= 0; i--) {
            if(temp.charAt(i) != '-')
                finalResult = finalResult + temp.charAt(i);
        }


        if(temp.contains("-")) {
            finalResult = "-" + finalResult;
        }

          if(Long.parseLong(finalResult) >= Integer.MAX_VALUE || Long.parseLong(finalResult) <= Integer.MIN_VALUE) {
            return 0;
        }

 
return Integer.valueOf(new Integer(finalResult).toString());
  

    }
}
