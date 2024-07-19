import java.util.*;

public class SubsetSumbool {

        public static boolean isSubset(int[] a, int sum,
                                      int i) {
            // Base Cases
            if (sum == 0) {
                return true;
            }
            if (sum < 0) {
                return false;
            }
            if (i >= a.length) {
                return false;
            }

            // Recursive Calls
            boolean recCall1 = isSubset(a, sum-a[i], i + 1);
            boolean recCall2 = isSubset(a, sum, i + 1);

            return recCall1 || recCall2;
        }

        public static void main(String[] args) {
                int[] arr = {2,4,6,8};
                System.out.println(isSubset(arr,
                        10,0));
            }

        }

