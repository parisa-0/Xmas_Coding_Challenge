class Solution {
  //https://www.youtube.com/watch?v=OEW50g03mT0
    public static String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int remainder = 0;
        int sum = 0;
        StringBuilder result =  new StringBuilder();
        while(i>=0 || j>=0 || remainder == 1){
            sum = remainder;
            if(i>=0) sum = sum+a.charAt(i)-'0'; //converting character to number
            if(j>=0) sum = sum+b.charAt(j)-'0';
            result.append((char)(sum%2+'0')); //if 1 + 1, we divide by 2 so it's 0 
            remainder = sum/2; //carry remainder 1 
            i--;
            j--;
        }
        return result.reverse().toString();
    }
    }        
    /*class Solution {

    static String result = "";
    static String reverseResult = "";
    static String remainder = "";

    static String returnSumOfBinaryIntegers(char a, char b) {
        if (a == '1' && b == '1') {
            return 10 + "";
        } else if (a == '0' && b == '1') {
            return 1 + "";
        } else if (a == '1' && b == '0') {
            return 1 + "";
        } else if (a == '0' && b == '0') {
            return 0 + "";
        }
        return "";
    }

    public static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || remainder.length() > 0) {
              if(i < 0 && j >= 0 && remainder.length() != 0) {
                result = result + j + remainder;
                remainder = "";
                j--;
            }
            else if(i >= 0 && j < 0 && remainder.length() != 0) {
                result = result + i + remainder;
                remainder = "";
                i--;
            }
            else if(i < 0 && j < 0 && remainder.length() != 0) {
                System.out.println(result);
                System.out.println("reaminder" + remainder);
                result = result + remainder;
                remainder = "";
            }
            else if(i >= 0 && j >= 0 && remainder.length() == 0 &&
                    !returnSumOfBinaryIntegers(a.charAt(i), b.charAt(j)).equals("10")) {
                result = result + returnSumOfBinaryIntegers(a.charAt(i), b.charAt(j));
                i--;
                j--;
            }
            else if(i >= 0 && j >= 0 && remainder.length() != 0 &&
                    !returnSumOfBinaryIntegers(a.charAt(i), b.charAt(j)).equals("10")) {
                String theReturnValue = returnSumOfBinaryIntegers(a.charAt(i), b.charAt(j));
                if(!returnSumOfBinaryIntegers(theReturnValue.charAt(0), remainder.charAt(0)).equals("10")) {
                    result = result + returnSumOfBinaryIntegers(theReturnValue.charAt(0), remainder.charAt(0));
                    remainder = "";
                    i--;
                    j--;
                }
                else if (returnSumOfBinaryIntegers(theReturnValue.charAt(1), remainder.charAt(0)).equals("10")) {
                    result = result + returnSumOfBinaryIntegers(theReturnValue.charAt(1), remainder.charAt(0));
                    remainder = 1 + "";
                    i--;
                    j--;
                }
            }
            else if (i >= 0 && j >= 0 && remainder.length() == 0 &&
                    returnSumOfBinaryIntegers(a.charAt(i), b.charAt(j)).equals("10")) {
                result = result + 0;
                remainder = 1 + "";
                i--;
                j--;
            }

            else if (i >= 0 && j >= 0 && remainder.length() == 0 &&
                    returnSumOfBinaryIntegers(a.charAt(i), b.charAt(j)).equals("10")) {
                result = result + 0;
                remainder = 1 + "";
                i--;
                j--;
            }
            else if(i >= 0 && j >= 0 && remainder.length() != 0 &&
                    returnSumOfBinaryIntegers(a.charAt(i), b.charAt(j)).equals("10")) {
                if(remainder.equals("1")) {
                    result = result + 0;
                    remainder = 1 + "";
                    i--;
                    j--;
                }
                else if(remainder.equals("0")) {
                    result = result + 1;
                    remainder = 1 + "";
                    i--;
                    j--;
                }
            }

        }

        for(int k = result.length() - 1; k >= 0; k--) {
            reverseResult = reverseResult + result.charAt(k);
        }
        return reverseResult;
    }

    public static void main(String[] args) {
        System.out.println(addBinary("111","1"));
    }
}
*/
