package Accenture_training;
import java.util.Scanner;
public class Primenum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        for(int n=2;n<=num;n++){
            if(check(n)){
                System.out.print(n+" ");
            }
        }
    }
    static boolean check(int num){
        for(int n=2;n<num;n++){
            if(num%n==0){
                return false;
            }
        }
        return true;
    }
}
