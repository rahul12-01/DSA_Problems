class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] arr = new int[nums.length];
        int product = 1;
        boolean singleZero=false;
        boolean multiZero=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(!singleZero){
                    singleZero=true;
                }else{
                    if(!multiZero){
                        multiZero=true;
                    }
                }
            }else{
                product*=nums[i];
            }
            
        }

        for(int j=0;j<nums.length;j++){
            if(multiZero){
                arr[j]=0;
            }else if(singleZero && nums[j]!=0){
                arr[j]=0;
            }else if(nums[j]==0){
                arr[j]=product;
            }else{
                arr[j]=product/nums[j];
            }
        }
        return arr;

    }
}