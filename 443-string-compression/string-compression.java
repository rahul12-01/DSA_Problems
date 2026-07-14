class Solution {
    public int compress(char[] chars) {
        int count =1;
        int res=0;
        char temp =chars[0];
        for (int i=1;i<chars.length;i++){
            if (temp!=chars[i]){
                chars[res++]=temp;
                temp=chars[i];
                if (count>1)
                    for (int k=0;k<(count+"").length();k++)
                    chars[res++]=(count+"").charAt(k);
                count=1;

            }
            else count++;
        }
        chars[res++]=temp;
        if (count>1)
            for (int k=0;k<(count+"").length();k++)
            chars[res++]=(count+"").charAt(k);
        // System.out.println(Arrays.toString(chars));
        return res;
    }
}