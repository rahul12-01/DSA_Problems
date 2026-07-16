class Solution {
    public int largestAltitude(int[] gain) {
        int sum =0;
        int maxSum=sum;
        for (int i: gain){
            sum =sum+i;
            maxSum  = Math.max(sum ,maxSum );
        }
        return maxSum;
    }
}