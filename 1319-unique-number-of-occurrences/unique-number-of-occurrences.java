class Solution {
    public int count (int[] arr, int num){
        int count =0;
        for (int n:arr){
            if (n==num)
                count++;
        }
        return count ;
    }
    public boolean uniqueOccurrences(int[] arr) {
        Map <Integer,Integer> mp = new HashMap<>();
        for (int i:arr){
            mp.put(i,count(arr,i));
        }
        System.out.println(mp);
        List<Integer> l= new ArrayList<>(mp.values());
        Set <Integer> h = new HashSet<>(mp.values());
        return (l.size()==h.size());
    }
}