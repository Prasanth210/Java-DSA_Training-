package Problems;

public class Perfect_number {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(28));
    }
    public static boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1;
        for (int n = 2; n <= Math.sqrt(num); n++) {
            if (num % n == 0) {
                sum += n + (num / n == n ? 0 : num / n);
            }
        }
        return sum == num;
    }
}
