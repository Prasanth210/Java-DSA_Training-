public class Ques5 {
        public static void main(String[] args) {
            System.out.println(calculate(3));
        }

        public static int calculate(int n) {
            if (n == 0) {
                return 0;
            } else {
                int ans = n * n + calculate(n - 1);
                return ans;
            }
        }
    }
