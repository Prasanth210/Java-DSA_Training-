public class Ques4 {
        public static void main(String[] args) {
            System.out.println(sumDigits(4321));
        }

        public static int sumDigits(int n) {
            if (n == 0) {
                return 0;
            } else {
                int ans = (n % 10) + sumDigits(n / 10);
                return ans;
            }
        }
    }

