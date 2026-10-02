import java.util.*;
public class NumbersOnWhiteboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            System.out.println(2);
            for(int j = 1; j <= n - 1; j++) {
                if(j <= 2) {
                    System.out.println(n + " " + (n - j));
                }
                else {
                    System.out.println((n - j + 2) + " " + (n - j));
                }
            }
        }
        sc.close();
    }   
}