import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            System.out.println("Processing: " + ch);

            if (ch != ']') {
                st.push(String.valueOf(ch));
                System.out.println("Push: " + st);
            } else {

                String str = "";
                while (!st.isEmpty() && !st.peek().equals("[")) {
                    str = st.pop() + str;
                    System.out.println("Popped for string: " + st + " | str = " + str);
                }

                st.pop(); // remove '['
                System.out.println("Removed [: " + st);

                String num = "";
                while (!st.isEmpty() && Character.isDigit(st.peek().charAt(0))) {
                    num = st.pop() + num;
                    System.out.println("Popped digit: " + st + " | num = " + num);
                }

                int count = Integer.parseInt(num);
                String repeated = str.repeat(count);

                System.out.println("Repeat: " + str + " x " + count + " = " + repeated);

                st.push(repeated);
                System.out.println("Push repeated: " + st);
            }

            System.out.println("-----------------------");
        }

        System.out.println("Final Stack: " + st);

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.insert(0, st.pop());
        }

        return ans.toString();
    }
}
