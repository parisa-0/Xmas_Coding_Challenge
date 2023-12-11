package org.example;


public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=jKF9AcyBZ6E

        int pointer = 0;
        int sum = 0;
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int minLength = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum >= target) {
              minLength = Math.min(i + 1 - pointer, minLength);
              sum = sum - nums[pointer];
              pointer++;
            }
        }

        if(minLength == Integer.MAX_VALUE) {
            minLength = 0;
        }

        System.out.println(minLength);
    }
}

/*
        int sum = 0;
        int a_pointer = 0;
        int b_pointer = 0;
        int target = 11;
        int[] nums = {1,2,3,4,5};
        int minLength = Integer.MAX_VALUE;
        boolean isDuplicate = false;

        List<Integer> myList = new LinkedList<>();


        while(b_pointer < nums.length) {

            if(sum + nums[b_pointer] < target) {
                sum = sum + nums[b_pointer];
                if(!myList.contains(nums[b_pointer]) && (b_pointer >= 1 && nums[b_pointer] != nums[b_pointer-1])) {
                    myList.add(nums[b_pointer]);
                }
                b_pointer++;
            }

            else if (sum + nums[b_pointer] >= target) {
                System.out.println(a_pointer);
                if(!myList.contains(nums[b_pointer]) && nums[b_pointer] != nums[b_pointer-1]) {
                    myList.add(nums[b_pointer]);
                    minLength = Math.min(myList.size(), minLength);
                }
                if(sum + nums[b_pointer] != target) {
                    myList.remove(Integer.valueOf(nums[a_pointer]));
                    minLength = Math.min(myList.size(), minLength);

                }
                if(a_pointer + 1 < nums.length) {
                    a_pointer++;
                }
                else  {
                    b_pointer++;
                }
                if(sum - nums[a_pointer] >= 0) {
                    sum = sum - nums[a_pointer];
                }
                sum = 0;
            }
        }

        if(minLength == Integer.MAX_VALUE) {
            minLength = 0;
        }

      System.out.println(minLength);
        */
