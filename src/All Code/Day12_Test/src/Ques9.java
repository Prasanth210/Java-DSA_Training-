public class Ques9 {
        public static void printAns(int a, int b,
                                          String ans){
            if(a==b){
                System.out.println(ans);
                return;
            }
            if(a>b){
                return;
            }
            printAns(a+2,b,ans+2);
            printAns(a+1,b,ans+1);
        }

        public static void main(String[] args) {
            printAns(0,3,"");
        }
    }