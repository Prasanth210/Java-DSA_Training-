public class Ques3 {
        public static void main(String[] args) {
            System.out.println(f(5));
        }

        public static int f(int n) {
            if (n <= 1) {
                return 1;
            } else {
                int ans = n * f(n - 2);
                return ans;
            }
        }
    }