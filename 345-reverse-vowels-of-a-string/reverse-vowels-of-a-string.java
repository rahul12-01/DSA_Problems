class Solution {
    public boolean isVowels(char c){
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char[] arr=s.toCharArray();
        String vowels = "aeiouAEIOU";
        char temp;
        while (left<right){
            if(isVowels(arr[left])&&isVowels(arr[right])){
                temp = arr[left];
                arr[left] = arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(isVowels(arr[left])){
                right--;
            }else if(isVowels(arr[right])){
                left++;
            }else{
                right--;
                left++;
            }
        }
        return new String(arr);
    }
}