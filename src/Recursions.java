import java.util.*;

public class Recursions {
    public static void main(String[] args) {

        Recursions Rec = new Recursions();
//      series_num(10);
//      recursion(5);
//      Combination(1,2,3,"");
//      num_words(503);
//      valid_bracket("",0,0,3);
//      System.out.println(  remove_dupicate("abcdaabf"));

//      System.out.println( "\n"+sum_num(10));

//      int[] arr={10,20,30};
//      sum_substring(arr,0,"",0,30);
//      System.out.println(Rec.Factorial(7));
//        System.out.println(Rec.Fibbanic_number(5));
        Rec.Fibbanic_series(7);
    }

    //print series of numbers
    public static void series_num(int num) {
        if (num == 0) {
            return;
        } else {
            System.out.println(num);
            series_num(num - 1);
        }
    }

    //print sum of numbers
    public static int sum_num(int num) {

        if (num == 1) {
            return 0;
        } else {
            return num + sum_num(num - 1);
        }

    }

    public static void recursion(int num) {
        if (num == 1) {
            System.out.println(num);
            return;
        }

        recursion(num - 1);
        System.out.println(num);
    }

    public static void Combination(int one, int two, int three, String ans) {

    }

    public static void num_words(int num) {
        int val = num % 10;
        if (num <= 0) {
            return;
        }
        num_words(num / 10);
        switch (val) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 0:
                System.out.println("zero");
        }
    }

    public static void valid_bracket(String str, int open, int close, int n) {
        if (str.length() == n * 2) {
            System.out.println(str);
        }
        if (open < n) {
            valid_bracket(str + "(", open + 1, close, n);
        }
        if (close < open) {
            valid_bracket(str + ")", open, close + 1, n);
        }
    }

    public static String remove_dupicate(String str) {

        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) {
            return remove_dupicate(str.substring(1));
        } else {
            return str.charAt(0) + remove_dupicate(str.substring(1));
        }
    }

    public static void sum_substring(int[] arr, int idx, String set, int sum, int tar) {
        if (idx == arr.length) {
            if (tar == sum) {
                System.out.println(set);
            }
            return;
        }
        if (tar == sum) {
            System.out.println(set);
            return;
        }
        sum_substring(arr, idx + 1, set + arr[idx] + " ", sum + arr[idx], tar);
    }
    //To print factorial number
    int Factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return Factorial(num - 1) * num;
    }
    //To print fibbanic number
    int Fibbanic_number(int num) {
        if (num <= 1) {
            return 1;
        }
        return Fibbanic_number(num - 1) + (num - 2);
    }

    //To print fibbanic series
    static int n1=0,n2=1,n3=0;
    void Fibbanic_series(int num) {
        if (num > 1) {
         n3=n1+n2;
         n1=n2;
         n2=n3;
         System.out.print(" "+n3);
         Fibbanic_series(num - 1);
        }

    }
}

