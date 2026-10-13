// Question Link : https://codeforces.com/problemset/problem/887/A
// Explanation
// According to the problem, we need to check whether the given binary number represents a number divisible by 64.
// A binary number is divisible by 64 if its last 6 bits are all zeros, because 64 = 2^6.
// We traverse the string and maintain two variables:
//      1. `one` counts the number of 1s encountered so far.
//      2. `lz` counts the leading zeros before the first 1.
// While traversing the string, if we encounter a zero before the first 1, we increment `lz`. Whenever we encounter a 1, we increment `one`.
// Since the binary number starts with leading zeros, we can ignore those zeros when checking divisibility.
// The expression
//     s.length() - (one - 1) - lz
// calculates the number of zeros after the first 1.
// If this value is greater than 6, it means there are at least 6 zeros after the first 1, so the number is divisible by 64 and we print "YES".
// Otherwise, we print "NO".
import java.util.*;
public class DivDotSixtyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int one = 0;
        int lz = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '0' && one == 0) {
                lz++;
            }
            if(ch == '1') {
                one++;
            }
        }

        if(s.length() - (one - 1) - lz > 6) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        sc.close();
    }
}