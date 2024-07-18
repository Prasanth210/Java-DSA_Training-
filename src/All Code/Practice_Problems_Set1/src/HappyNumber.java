import java.util.HashSet;

public class HappyNumber {
        public static boolean isHappy(int n) {
            HashSet<Integer> map = new HashSet<>();
            while(n!=1 && !(map.contains(n))){
                map.add(n);
                n = getNext(n);

            }
            return n==1;

        }
        public static int getNext(int n){
            int totalSum = 0;
            while(n>0){
                int d = n%10;
                n = n/10;
                totalSum +=d*d;
            }
            return totalSum;
        }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
