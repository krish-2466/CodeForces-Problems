// Question Link : https://codeforces.com/problemset/problem/352/A
// Explanation
// The number can be formed only if there is at least one zero.
// To form the largest possible number, we should place all the 5s first and all the 0s after them.
// Now, the tricky part is checking whether the number is divisible by 90.
// A number is divisible by 90 if and only if it is divisible by both 9 and 10.
// For a number to be divisible by 10, its last digit must be 0. Therefore, there must be at least one zero.
// Since the number already ends with 0, the divisibility condition for 5 is also automatically satisfied.
// A number is divisible by 9 if and only if the sum of its digits is divisible by 9.
// Since the only non-zero digit is 5, we need the number of 5s to be a multiple of 9. Therefore, we calculate:
//     pair = five / 9
// Here, pair represents how many groups of 9 fives we can form.
// If there is no zero, we cannot form a number divisible by 90, so we print -1.
// If we cannot form even one group of 9 fives, the answer is 0.
// Otherwise, we print all the required 5s followed by all the zeros.
// For example, if we have 18 fives and 2 zeros:
//     55555555555555555500
// The sum of the digits is 18 * 5 = 90, which is divisible by 9,
// and the number ends with 0, so it is divisible by 90.
import java.util.*;
public class JeffandDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int five = 0;
        int zero = 0;
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if(a == 5) {
                five++;
            }
            else {
                zero++;
            }
        }
        int pair = five / 9;
        five = five - (pair * 9);
        if(zero == 0) {
            System.out.println(-1);
        }
        else if(pair == 0) {
            System.out.println(0);
        }
        else {
            StringBuilder b = new StringBuilder();
            b.append(String.valueOf(5).repeat(pair * 9));
            b.append(String.valueOf(0).repeat(zero));
            System.out.println(b);
        }
        sc.close();
    }
}