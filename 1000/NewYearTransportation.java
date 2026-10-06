// Question Link : https://codeforces.com/problemset/problem/500/A
// Explanation
// We can solve this problem by directly simulating the movement.
// We start from cell 1. From a cell j, we can move forward by arr[j] cells, so the next cell will be:
//     next = j + arr[j]
// We continue this process until we reach cell n.
// To keep track of all the cells that we can reach, we use a HashSet.
// Every time we reach a new cell, we add it to the set.
// There are two possible cases while moving:
// 1. If we reach cell n, we add it to the set and stop because there
//    are no more cells to move from.
// 2. Otherwise, we add the current cell to the set and move to the
//    next reachable cell using:
//        j = j + arr[j]
// Finally, we check whether the target cell t is present in the set.
// If t is present, it means we can reach cell t from cell 1, so we print "YES".
// Otherwise, we print "NO".
// For example:
//     n = 8, t = 4
//     arr = [1, 2, 1, 2, 1, 1, ...]
// Starting from cell 1:
//     1 -> 2 -> 4
// Since cell 4 is reachable, the answer is "YES".
// The solution works because from each cell there is only one possible next cell, so we only need to simulate the path starting from cell 1.
import java.util.*;
public class NewYearTransportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 1; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        int j = 1;
        while(true) {
            if(j == n) {
                set.add(j);
                break;
            }
            if(arr[j] + j < j) {
                break;
            }
            set.add(j);
            j = arr[j] + j;
        }
        if(set.contains(t)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        sc.close();
    }   
}