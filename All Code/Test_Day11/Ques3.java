package MCQs;

public class Ques3 {
        public static int mystery(int x, int y) {
            if (y == 0) {
                return 0;
            }
            int ans = x + mystery(x, y - 1);
            return ans;
        }

        public static void main(String[] args) {
            System.out.println(mystery(5, 3));
        }
    }
