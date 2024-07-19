public class ContainerWithMaxWater {
    public static int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max_area = 0;

        while(left<right){
            int length = Math.min(height[left],height[right]);
            int breadth = right - left;
            int area = length * breadth;

            if(area>max_area){
                max_area = area;
            }
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }

        return max_area;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int ans = maxArea(arr);
        System.out.println(ans);
    }
}
