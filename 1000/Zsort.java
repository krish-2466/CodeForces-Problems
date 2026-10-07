// Question Link : https://codeforces.com/problemset/problem/652/B
// Explanation :
// The required condition is:
//     ai >= ai - 1 and ai >= ai + 1
// for every even position i.
// In other words, every element at an even position must be greater than or equal to its neighbouring elements.
// To construct such an arrangement, we first put the smaller elements at the odd positions and the larger elements at the even positions.
// We use a min-heap (PriorityQueue) so that we can always get the smallest remaining element.
// First, we fill all the odd positions with the smallest elements:
//     1, 3, 5, ...
// Then, we fill the even positions with the remaining larger elements:
//     2, 4, 6, ...
// While filling the even positions, we check whether the current element is greater than or equal to both of its neighbours.
// For an even position i:
//     arr[i] >= arr[i - 1]
//     arr[i] >= arr[i + 1]
// If either condition is violated, the required Z-sort arrangement is not possible, so we print "IMPOSSIBLE".
// For the last position, there is only one neighbour, so we only check:
//     arr[i] >= arr[i - 1]
// If all the conditions are satisfied, we print the constructed array.
// The min-heap ensures that the smaller elements are placed at odd positions first, while the remaining elements are used for the even positions.
import java.util.*;
public class Zsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            q.add(a);
        }
        int[] arr = new int[n + 1];
        for(int i = 1; i <= n; i += 2) {
            arr[i] = q.poll();
        }
        for(int i = 2; i <= n; i += 2) {
            int a = q.poll();
            if(i == n) {
                if(a < arr[i - 1]) {
                    System.out.println("IMPOSSIBLE");
                    return;
                }
                arr[i] = a;
            }
            else {
                if(a < arr[i - 1] || a < arr[i + 1]) {
                    System.out.println("IMPOSSIBLE");
                    return;
                }
                arr[i] = a;
            } 
        }
        for(int i = 1; i <= n; i++) {
            if(i != n) {
                System.out.print(arr[i] + " ");
            }
            else {
                System.out.print(arr[i]);
            }
        }
    }
}