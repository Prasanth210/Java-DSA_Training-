public class Ques6 {
        public static void main(String[] args) {
            System.out.println(calculate(10));
        }

        public static int calculate(int n) {
            if (n == 0) {
                return 0;
            } else if (n % 2 == 0) {
                int ans = n + calculate(n - 2);
                return ans;
            } else {
                int ans = calculate(n - 1);
                return ans;
            }
        }
    }
