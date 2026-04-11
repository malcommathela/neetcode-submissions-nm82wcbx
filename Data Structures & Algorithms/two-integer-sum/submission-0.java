class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> prevdiff = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int compliment = target - num;

            if(prevdiff.containsKey(compliment)){

                return new int[] {prevdiff.get(compliment),i};

            }

            prevdiff.put(num,i);
        }


        
        return new int[] {};

        
    }
}
