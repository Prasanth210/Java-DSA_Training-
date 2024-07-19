public class Ques2 {
        public static void main(String[] args) {
            System.out.println(counting(4));
        }

        public static int counting(int n) {
            if (n <= 1) {
                return 1;
            } else {
                int ans = counting(n - 1) + counting(n - 2);
                return ans;
            }
        }
    }

