package MCQs;

public class Ques4 {
        public static int power(int base, int exp) {
            if (exp == 0) {
                return 1;

            } else if (exp % 2 == 0) {
                int ans = power(base * base, exp / 2);
                return ans;

            } else {
                int ans = base * power(base, exp - 1);
                return ans;
            }
        }

        public static void main(String[] args) {
            System.out.println(power(2, 10));
        }
    }


