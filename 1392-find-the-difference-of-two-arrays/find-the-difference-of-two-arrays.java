import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>  h2 = new HashSet<>();
        Set<Integer>  h1 = new HashSet<>();
        List <Integer> temp = new ArrayList<>();
        List <Integer> temp1 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int n:nums1){
            h1.add(n);
        } 
        for (int n:nums2){
            h2.add(n);
        } 

        for (int n:h1){
            if (!h2.contains(n)){
                temp.add(n);
            }
        }
        for (int n:h2){
            if (!h1.contains(n)){
                temp1.add(n);
            }
        }
        res.add(temp);
        res.add(temp1);

        return res;
    }
}