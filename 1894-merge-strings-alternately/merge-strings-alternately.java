class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l2=word2.length();
        int l1=word1.length();
        StringBuilder sb = new StringBuilder();
        int a;
        if (l1<l2)
            a=l1;
        else
            a=l2;

        for(int i=0;i<a;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
    // sb.append(word1.substring(a,l1));
    // sb.append(word2.substring(a,l2));

    return sb.toString()+word1.substring(a,l1)+word2.substring(a,l2);

    }
}