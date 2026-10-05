// Question Link : https://codeforces.com/problemset/problem/1374/C
// Explanation
// The concept of checking valid parentheses can be used here.
// We use a stack to cancel out every valid "()" pair.
// While traversing the string, if the current character is ')' and the top of the stack is '(', we pop the '(' from the stack because these two brackets form a valid pair.
// Otherwise, we push the current character into the stack.
// After processing the entire string, the stack contains only the unmatched brackets.
// Since the string has equal numbers of '(' and ')' characters, the number of unmatched opening brackets will be equal to the number of unmatched closing brackets.
// Therefore, if the stack contains k unmatched brackets, we need k / 2 moves to make the parenthesis sequence valid.
// So the answer is
//      stack.size() / 2
// For example:
//     s = "))(("
// After processing the string, the stack contains
//     "))(( "
// The stack size is 4, so the answer is:
//     4 / 2 = 2
// Thus, we need 2 moves.

import java.util.*;
public class MoveBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            Stack<Character> st = new Stack<>();
            for(int j = 0; j < n; j++) {
                char ch = s.charAt(j);
                if(!st.isEmpty()) {
                    if(ch == ')' && st.peek() == '(') {
                        st.pop();
                    }
                    else {
                        st.push(ch);
                    }
                }
                else {
                    st.push(ch);
                }
            }
            System.out.println(st.size() / 2);
        }
        sc.close();
    }
}
