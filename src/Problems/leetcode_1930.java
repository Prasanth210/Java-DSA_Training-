package Problems;
import java.util.*;
//1930. Unique Length-3 Palindromic Subsequences

public class leetcode_1930 {
        public static void main(String[] args) {
            String st="aabca";
            System.out.print(countPalindromicSubsequence(st));

        }
        static int countPalindromicSubsequence(String s) {
            int[] R = new int[26];
            for (char u : s.toCharArray()) {
                R[u - 'a']++;
            }
            int[] L = new int[26];
            HashSet<Integer> S = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                int t = s.charAt(i) - 'a';
                R[t]--;
                for (int j = 0; j < 26; j++) {
                    if (L[j] > 0 && R[j] > 0) {
                        S.add(26 * t + j);
                    }
                }
                L[t]++;
            }

            return S.size();
        }
}
