class Solution {
    public String restoreString(String s, int[] indices) {
        
         Character[] result = new Character[indices.length];

        for(int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Character character : result) {
            stringBuilder.append(character);
        }

        String finalResult = stringBuilder.toString();

        return finalResult;
    }
}
