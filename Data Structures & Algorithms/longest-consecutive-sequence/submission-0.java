class Solution {
    public int longestConsecutive(int[] nums) {

        int n = 0;

        Set<Integer> seq = new HashSet<>();
        for (int i : nums){
            seq.add(i);
        }

        for (int x : seq){

            if (!seq.contains(x - 1)){
                int len = 1;
                while(seq.contains(x + len)){
                    len++;
                }
                
                n = Math.max(n,len);
            }

            
        }

        return n;

    }

        
    
}
