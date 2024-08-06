package Tree;

    import java.util.*;

    public class Demo {

        public static int maxEqualProductParts(int[] A, int N) {
            long totalProduct = 1;
            for (int num : A) {
                totalProduct *= num;
                // If the product becomes 0, it's not possible to partition
                if (totalProduct == 0) return -1;
            }

            List<Long> divisors = new ArrayList<>();
            for (long i = 1; i * i <= totalProduct; i++) {
                if (totalProduct % i == 0) {
                    divisors.add(i);
                    if (i != totalProduct / i) {
                        divisors.add(totalProduct / i);
                    }
                }
            }
            Collections.sort(divisors, Collections.reverseOrder());

            for (long targetProduct : divisors) {
                int count = 0;
                long currentProduct = 1;
                boolean validPartition = true;

                for (int num : A) {
                    currentProduct *= num;
                    if (currentProduct == targetProduct) {
                        count++;
                        currentProduct = 1;
                    } else if (currentProduct > targetProduct) {
                        validPartition = false;
                        break;
                    }
                }

                if (validPartition && currentProduct == 1 && count > 1) {
                    return count;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] A = {36, 6, 6, 3, 12};
            int N = A.length;

//            int result = maxEqualProductParts(A, N);
//            System.out.println(result);  // Output: 3
            String st="7868190130M7522";
            System.out.println(st.substring(11,13));
        }
    }

