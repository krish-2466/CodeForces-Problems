// https://codeforces.com/problemset/problem/158/B
import java.util.*;
public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int count = 0;
        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            if(a == 1) {
                one++;
            }
            else if(a == 2) {
                two++;
            }
            else if(a == 3) {
                three++;
            }
            else {
                four++;
            }
        }
        count = count + (two / 2);
        two = two % 2;
        if(one >= three) {
            count += three;
            one -= three;
            three = 0;
        }
        else if(one < three) {
            count += one;
            three = three - one;
            one = 0;
        }
        if(one >= 2 && two != 0) {
            count++;
            one = one - 2;
            two = 0;
        }
        else if(one > 0 && two != 0) {
            count++;
            one = one - 1;
            two = 0;
        }
        if(one % 4 != 0) {
            count++;
        }
        count = count + two + (one / 4) + three + four;
        System.out.println(count);
        sc.close();
    }
}