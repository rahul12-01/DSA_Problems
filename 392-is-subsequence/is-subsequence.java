class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int count =0;
        if(s.length()>0 && t.length()==0){
            return false ;
        }
        if (s.length()==0 && t.length()>0){
            return true ;
        }
        char [] arr =s.toCharArray();

        for (char ch:t.toCharArray()){
            if (i<arr.length && ch==arr[i]  ){
                i++;
                count++;
            }
        }
        return count == s.length();
    }
}