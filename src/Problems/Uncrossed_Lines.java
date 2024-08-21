package Problems;

import java.util.Arrays;

/*
1035. Uncrossed Lines

You are given two integer arrays nums1 and nums2. We write the integers of nums1 and nums2 (in the order they are given)
on two separate horizontal lines.
We may draw connecting lines: a straight line connecting two numbers nums1[i] and nums2[j] such that:

nums1[i] == nums2[j], and
the line we draw does not intersect any other connecting (non-horizontal) line.
Note that a connecting line cannot intersect even at the endpoints (i.e., each number can only belong to one connecting line).

Return the maximum number of connecting lines we can draw in this way.


 */
public class Uncrossed_Lines {
    public static void main(String[] args) {
        int[] num1={1,1,2,1,2};
        int[] num2={1,3,2,3,1};

        int[][] freq=new int[num1.length+1][num2.length+1];
        for(int n=0;n<freq.length;n++) Arrays.fill(freq[n],-1);

        System.out.println(dp(0,0,num1,num2,freq));
    }
    static int dp(int i,int j ,int[] num1,int[] num2,int[][] freq){

        if(i==num1.length || j==num2.length)return freq[i][j]=0;
        if(freq[i][j]!=-1)return freq[i][j];

        int p1=Math.max(dp(i+1,j,num1,num2,freq),dp(i,j+1,num1,num2,freq));
        int p2=0;
        if(num1[i]==num2[j]){
            p2=1+dp(i+1,j+1,num1,num2,freq);
        }
        return freq[i][j]=Math.max(p1,p2);
    }
}
