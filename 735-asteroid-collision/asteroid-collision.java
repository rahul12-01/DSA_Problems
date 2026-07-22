class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> stack = new Stack<>();
        stack.push(asteroids[0]);
        for (int n =1; n<asteroids.length;n++){
            if (asteroids[n]>0){
                stack.push(asteroids[n]);
            }
            if(asteroids[n]<0){
                while (!stack.isEmpty() &&stack.peek() > 0 &&stack.peek() <-asteroids[n]) {
                    stack.pop();
                }
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[n]);
                }
                else if (stack.peek()==asteroids[n]*-1)
                    stack.pop();
                else 
                    continue;
            }
            
        }
        System.out.println(stack);
        int[] ans = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}