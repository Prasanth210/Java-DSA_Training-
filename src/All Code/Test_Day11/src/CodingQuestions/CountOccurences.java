package CodingQuestions;

public class CountOccurences {
         static int count;
        public static void countOcc(int num, int target) {
            // Base case: if num is 0 and count is still 0, handle the edge case for 0

            if (num == 0) {
                return;
            }

            int lastDigit = num % 10;

            if (lastDigit == target) {
                count++;
            }

            // Recursive call to check the remaining digits
            countOcc(num / 10, target);
        }

        public static void main(String[] args) {
            int num = 112232;
            int target = 2;
            countOcc(num, target);
            System.out.println(count);
        }
    }

