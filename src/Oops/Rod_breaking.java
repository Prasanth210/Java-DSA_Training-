package Oops;

public class Rod_breaking {
    public static void main(String[] args) {
        int [] cost={0,1,5,8,9,10,17,17,20};
        System.out.println(recursion(cost,cost.length-1));
    }
    static int recursion(int[] cost,int n){
        int max_price=cost[n];
        int left=1;
        int right=n-1;

        while(left<=right){
            int left_max=recursion(cost, left);
            int right_max=recursion(cost, right);
            if(max_price<left_max+right_max){
                max_price=left_max+right_max;
            }
            left++;
            right--;
        }
        return max_price;
    }
}
