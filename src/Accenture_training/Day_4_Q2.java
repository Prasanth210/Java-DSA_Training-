package Accenture_training;

import java.util.ArrayList;
import java.util.Scanner;

public class Day_4_Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int num = scan.nextInt();

        System.out.println(fun(str, num));

    }

    static String fun(String str, int num) {

        if (num > str.length()) return "Invalid input";
        String ans = "";
        for (int n = 0; n < str.length(); n++) {
            if (n >= str.length() - num) {
                ans += str.charAt(n);
            }
        }
        for (int n = 0; n < str.length(); n++) {
            if (n >= num && n < str.length() - num) {
                ans += str.charAt(n);
            }
        }
        for (int n = 0; n < str.length(); n++) {
            if (n < num) {
                ans += str.charAt(n);
            }
        }
        return ans;
    }
}
