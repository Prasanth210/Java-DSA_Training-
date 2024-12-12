package Accenture_training;

public class Pattern {
    public static void main(String[] args) {
        int num=5;

        for(int n=0;n<num;n++){
            int k=1;
            for(int p=0;p<=n;p++){
                if(p==n){
                    System.out.print(k);
                    k++;
                }
                else {
                    System.out.print(k + " ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
