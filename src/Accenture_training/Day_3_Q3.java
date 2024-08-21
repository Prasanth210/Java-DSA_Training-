package Accenture_training;

import java.util.Scanner;

public class Day_3_Q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();

        int count=0;
        for(int n=str.length()-1;n>=0;n--){
            if(str.charAt(n) != ' '){
                count++;
            }
            if(count != 0 && str.charAt(n) == ' '){
                break;
            }
        }
        System.out.println(count);

    }
}
