// Question Link : https://codeforces.com/problemset/problem/131/A
// Explanation
// The idea is to check whether the given string follows either of the two conditions in which the capitalization needs to be changed.
// We use two variables:
//      1. `upper` counts the uppercase letters in the string.
//      2. `isfirst` indicates whether the first character is lowercase.
// While traversing the string, we check the ASCII value of each character.
// If the character is at index 0, we check whether it is lowercase.
// If it is uppercase, we increment `upper`.
// For all the remaining characters, we count the uppercase letters.
// After traversing the string, there are two possible cases:
//      1. If all characters are uppercase, we change the entire string to lowercase.
//      2. If the first character is lowercase and all the remaining characters are uppercase, we capitalize the first character and change 
//         the remaining characters to lowercase.
// We check these conditions using:
//     upper == n
//     isfirst == 1 && upper == n - 1
// If either condition is satisfied, we toggle the case of every character and print the resulting string.
// Otherwise, we print the original string without making any changes.

import java.util.*;
public class Question1 {
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