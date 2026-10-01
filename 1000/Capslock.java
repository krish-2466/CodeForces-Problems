// Question Link : https://codeforces.com/problemset/problem/131/A

import java.util.*;

public class Capslock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder r = new StringBuilder();
        int n = s.length();
        int upper = 0;
        int isfirst = 0;
        for(int i = 0; i < n; i++) {
            int ascii = (int)s.charAt(i);
            if(i == 0) {
                if(ascii >= 97 && ascii <= 122) {
                    isfirst = 1;
                }
                else {
                    upper++;
                }
            }
            else {
                if(ascii >= 65 && ascii <= 91) {
                    upper++;
                }
            }
        }
        if((upper == n) || (isfirst == 1 && upper == n - 1)){
            for(int i = 0; i < n; i++) {
                int as = (int)s.charAt(i);
                if(as >= 65 && as <= 91) {
                    r.append((char)(as + 32));
                }
                else {
                    r.append((char)(as - 32));
                }
            }
            System.out.println(r);
        }
        else {
            System.out.println(s);
        }
        sc.close();
    }   
}