class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> myMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], myMap.getOrDefault(nums[i],0)+1);
        }

         Map.Entry<Integer, Integer> actualValue = myMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == Collections.max(myMap.values()))
                .findFirst()
                .get();

        return actualValue.getKey();
    }
}
