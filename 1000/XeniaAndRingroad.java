// Question Link : https://codeforces.com/problemset/problem/339/B
// Explanation
// In this question, we have to calculate the total time required to complete all the tasks.
// For the i-th task, we need to reach house ai.
// Moving from one house to the adjacent house takes 1 second.
// The houses form a one-way circular road. We initially start at house 1, and we can only move in the given direction.
// Since the road is circular, after house n we move to house 1.
// We maintain the current house in the variable j.
// There are two cases:
// 1. If the destination house a is greater than or equal to the current house j, we can directly move from j to a.
//                              Time required = a - j

// 2. If the destination house a is less than the current house j, we have to reach house n first and then continue from house until we reach house a.
//                              Time required = (n - j) + a

// After reaching the destination, we update j to a.
// We add the time required for every task to the sum variable.
// Finally, sum gives the total time required to complete all tasks.
import java.util.*;
public class XeniaAndRingroad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = 1;
        long sum = 0;
        for(int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            if(a < j) {
                sum = sum + (n - j + a);
                j = a;
            }
            else {
                sum = sum + (a - j);
                j = a;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}