import java.util.*;

public class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();

            Stack<Character> stack = new Stack<>();
            boolean balanced = true;

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                // Opening brackets
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                }

                // Closing brackets
                else if (ch == ')' || ch == '}' || ch == ']') {

                    if (stack.isEmpty()) {
                        balanced = false;
                        break;
                    }

                    char top = stack.pop();

                    if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {

                        balanced = false;
                        break;
                    }
                }
            }

            // Stack must be empty at the end
            if (!stack.isEmpty()) {
                balanced = false;
            }

            System.out.println(balanced);
        }

        sc.close();
    }
}
