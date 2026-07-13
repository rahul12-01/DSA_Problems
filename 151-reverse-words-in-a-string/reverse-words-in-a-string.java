import java.util.*;
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] sl = s.split("\\s+");
        // System.out.println(Arrays.toString(sl));

        for (int i=sl.length-1;i>=0;i--){
            sb.append(sl[i]);
            if(i!=0)
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}