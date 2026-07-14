class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=i+k;
        int maxSum = Integer.MIN_VALUE;
        while( i+k<=nums.length){ 
        int sum=0;
        for (int n=i;n<i+k;n++)
            sum+=nums[n];
        if (sum>maxSum)
            maxSum=sum;
        i++;
        // System.out.println(maxSum);
        // System.out.println(sum);
        }
        return (double)maxSum/k;
    }
}