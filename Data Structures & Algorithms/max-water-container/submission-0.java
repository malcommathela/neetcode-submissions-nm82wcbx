class Solution {

    public int maxArea(int[] heights) {

        int max_vol = 0;
        int l = 0;
        int r = heights.length - 1;
        // return r;

        while(l < r){

            int lob = (heights[l] < heights[r]) ? heights[l] : heights[r];

            int vol = (r - l) * lob ;

            if(vol > max_vol){
                max_vol = vol;
            }

            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }

        return max_vol;
        
    }
}
