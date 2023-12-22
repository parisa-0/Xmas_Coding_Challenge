class Solution {
    public int singleNumber(int[] nums) {
         Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], myMap.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
