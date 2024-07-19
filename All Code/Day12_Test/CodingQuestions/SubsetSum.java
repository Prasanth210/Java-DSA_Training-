public class SubsetSum {
    static int[] arr = {2,4,6,8};
    public static void findSubsets(
                                       int idx,
                                       String set,
                                       int sum_so_far,
                                       int tar) {

        if(tar == sum_so_far){
            System.out.println(set);
            return;
        }

            if(idx == arr.length){
                return;
            }
        if(sum_so_far > tar){
            return;
        }
            //take
            findSubsets(idx+1,set+arr[idx]+" ",
                    sum_so_far+arr[idx],tar);
            //not take
            findSubsets(idx+1,set,sum_so_far,tar);
        }

        public static void main(String[] args) {

            int targetSum = 12;
            findSubsets(0,"",0,
                    targetSum);
        }
    }

