import java.util.*;
public class Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(n <= a || a > b) {
                System.out.println(1);
            }
            else {
                if(n % a == 0) {
                    System.out.println(n / a);
                }
                else {
                    System.out.println((n / a) + 1);
                }
            }
        }
        sc.close();
    }
}