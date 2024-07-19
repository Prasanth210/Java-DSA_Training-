package MCQs;

public class Ques2 {
        public static int sum(int n) {
            if (n == 1) {
                return 1;
            } else {
                int ans = n + sum(n / 2);
                return ans;
            }
        }

        public static void main(String[] args) {
            System.out.println(sum(10));
        }
    }

