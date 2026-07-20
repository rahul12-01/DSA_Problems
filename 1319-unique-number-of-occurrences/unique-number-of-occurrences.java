class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map <Integer,Integer> mp = new HashMap<>();
        for (int i:arr){
        mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        // System.out.println(mp);
        return (mp.size()==new HashSet<>(mp.values()).size());
    }
}