class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int maxArea=0;
        int j=height.length-1;
        while (i<j){
   
            int area=(Math.min(height[i],height[j]))*(j-i);
            if (height[i] < height[j]) {
                i++;
            }
            else {
                j--;
            }
            maxArea= Math.max(area,maxArea);
        }
        return maxArea;
    }
}