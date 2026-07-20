import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer>  h2 = new ArrayList<>();
        List<Integer>  h1 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int n:nums1){
            h1.add(n);
        } 
        for (int n:nums2){
            h2.add(n);
        } 
        Set <Integer> temp = new HashSet<>();
        for (int n:nums1){
            if (!h2.contains(n)){
                temp.add(n);
            }
        }
        res.add(new ArrayList<>(temp));
        Set <Integer> temp1 = new HashSet<>();
        for (int n:nums2){
            if (!h1.contains(n)){
                temp1.add(n);
            }
        }
        res.add(new ArrayList<>(temp1));

        return res;
    }
}