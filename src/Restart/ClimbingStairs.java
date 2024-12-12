package Restart;
import java.util.Scanner;
public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();

        int[] value=new int[num+1];

        value[0]=1;
        value[1]=1;
        for(int n=2;n<=num;n++){
            value[n]=value[n-1]+value[n-2];
        }
        System.out.println("The number Ways : "+value[num]);
    }
}
