package Problems;

public class Max_chunks {
    public static void main(String[] args) {
        int []Arr={4,3,2,1,0};
        int n = Arr.length-1;
        int max=-1;
        int count=0;

        for(int i=0;i<=n;i++){
            if(max<Arr[i]){
                max=Arr[i];
            }
            if(max == i){
                count++;
            }
        }
        System.out.println(count);
    }
}
