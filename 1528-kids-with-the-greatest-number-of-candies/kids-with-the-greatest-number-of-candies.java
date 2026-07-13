import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int l= candies.length;
        int temp[] = new int[l];
        List<Boolean> res = new ArrayList<>();
        for (int i=0;i<l;i++){
            temp[i]=candies[i]+extraCandies;
        }
        // System.out.println(Arrays.toString(temp));
         for (int i=0;i<l;i++){
             for (int j=0;j<l;j++){
                Arrays.sort(candies);
                if(temp[i]>=candies[l-1]){
                    res.add(true);
                    break;
                }
                else{
                    res.add(false);
                    break;
                }
             }
         }

        return res;
    }
}