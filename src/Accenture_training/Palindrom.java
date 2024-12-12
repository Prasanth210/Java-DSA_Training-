package Accenture_training;
public class Palindrom {
    public static void main(String[] args) {
    String str = "rac,e;ca r";
    System.out.println(palindrom(str));
}
public static boolean palindrom(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            else if(!Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            else{
                if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                    return false;
                }
                left++;
                right--;
            }

        }
        return true;
    }
}
