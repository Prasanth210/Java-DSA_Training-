package Collection;
import java.util.*;
public class StackCreation_ArrayList {
    public static void main(String args[]) {
    LinkedList <Integer>list=new LinkedList<>();
    list.add(0);
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String[] st_arr1 = str1.split(" ");
        String[] st_arr2 = str2.split(" ");

        String st1 = "";
        String st2 = "";
        for (int i = 0; i < st_arr1.length; i++) {
        st1 += st_arr1[i];
            st2 += st_arr2[i];
        }
        int num1=Integer.parseInt(st1);
        int num2=Integer.parseInt(st2);
        int sum=num1+num2;
        Stack <Integer> stack=new Stack<>();
        for(int i=0;i<st_arr1.length;i++){
            int num=sum%10;
            stack.push(num);
            sum=sum/10;
        }
        System.out.print(stack);
    }
}
