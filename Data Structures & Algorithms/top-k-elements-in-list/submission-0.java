class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int t : nums) {
            freq.put(t, freq.getOrDefault(t, 0) + 1);
        }

        
        int[] result = new int[k];
        int key = 0;

        for (int i = 0; i < k; i++) {
            int max = 0;
            for(Map.Entry<Integer, Integer> entry : freq.entrySet()){

                if(entry.getValue() > max){
                    max = entry.getValue();
                    key = entry.getKey();

                }

            }
            result[i] = key;
            freq.remove(key);
            
        }

        return result;

    }
}
