class Solution {
    public List<String> summaryRanges(int[] nums) {
         List<String> newList = new LinkedList<>();

        if(nums.length == 0) {
          return newList;
        }

        if(nums.length == 1) {
            newList.add("" + nums[0]);
            return newList;
        }
       int firstIntegerInRange = nums[0];

        for(int i = 0; i < nums.length; i++) {
            if(i + 1 != nums.length && nums[i] + 1 == nums[i + 1]) {
                continue;
            }
            else if(i + 1 != nums.length && nums[i] + 1 != nums[i + 1] && firstIntegerInRange != nums[i]) {
                newList.add(firstIntegerInRange + "->" + nums[i]);
                firstIntegerInRange = nums[i + 1];
            }
            else if(i + 1 != nums.length && nums[i] + 1 != nums[i + 1] && firstIntegerInRange == nums[i]) {
                newList.add("" + firstIntegerInRange);
                firstIntegerInRange = nums[i + 1];
            }
            else if(i + 1 == nums.length && nums[i] - 1 == nums[i - 1]) {
                newList.add(firstIntegerInRange + "->" + nums[i]);
                firstIntegerInRange = nums[i];
            }
           else if(i + 1 == nums.length && nums[i] - 1 != nums[i - 1]) {
                newList.add("" + nums[i]);
            }
        }

        return newList;
    }
}
