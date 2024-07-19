package MCQs;

public class Ques1 {
        public static void printNumbers(int n) {
            if (n < 0) {
                return;
            }
            printNumbers(n - 2);
            System.out.print(n + " ");
        }

        public static void main(String[] args) {
            printNumbers(5);
        }
    }

