class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        double sum=0;
        double temp=0;

        // int sum=0;
        // int temp=0 ;
        for(int i:nums){
            totalSum+=i;
        }
        // System.out.println("total --- "+totalSum);

        for (int i=0;i<nums.length;i++){
            if (i==0)
                sum=0;
            else 
                sum+=nums[i-1];
            // System.out.println("sum --- "+sum);
            temp=(totalSum-nums[i])/2.0;
            // System.out.println("temp --- "+temp);

            if (sum==temp)
                return i;
        }
        return -1;
    }
}