package Restart;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        leftTriangle(num);
        rightTriangle(num);
        reverseTriangle(num);
    }

    static void leftTriangle(int val) {
        for (int n = 0; n < val; n++) {
            for (int p = 0; p <= n; p++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightTriangle(int val) {
        for (int n = 1; n <= val; n++) {
            for (int p = 2 * (val - n); p >= 0; p--) { //set p=val-n  for Triangle
                System.out.print(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void reverseTriangle(int val) {
        for (int n = 1; n <= val; n++) {
            for (int p = 1; p <= n; p++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= val - n +1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
