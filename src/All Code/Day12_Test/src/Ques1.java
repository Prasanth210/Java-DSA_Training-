public class Ques1 {
        public static void main(String[] args) {
            System.out.println(Digits(7890));
        }

        public static int Digits(int n) {
            if (n == 0) {
                return 0;
            } else {
                int ans = 1 + Digits(n / 10);
                return ans;
            }
        }
    }
