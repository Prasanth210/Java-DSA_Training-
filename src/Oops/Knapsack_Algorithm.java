package Oops;

public class Knapsack_Algorithm {
    public static void main(String[] args) {
        int profit[] = new int[] { 60, 100, 120 };
        int weight[] = new int[] { 10, 20, 30 };
        int W = 50;

        maxprofit(profit,weight,W);
    }
    static void maxprofit(int[] profit,int[] weight,int w){
        int maxpro=0;
        int newmax=0;
        for(int i=0;i<weight.length-1;i++){
            if(weight[i]+weight[i+1] < w){
                newmax=profit[i]+profit[i+1];
                maxpro=(profit[i+2]/weight[i+2])*(w-weight[i]+weight[i+1]);
                maxpro=maxpro+newmax;
            }
           else if(weight[i]+weight[i+1] == w){
               maxpro=profit[i]+profit[i+1];
            }
        }
        System.out.println(maxpro);

        
    }
}
