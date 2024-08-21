package Tree;

    import java.util.*;

    public class Demo {

        public static int maxDistance(List<List<Integer>> arrays) {
            int min=0;
            int max=0;
            for(int n=0;n<arrays.size();n++){
                if(arrays.get(n).get(0) > min){
                    min=arrays.get(n).get(0);
                }
                if(arrays.get(n).get(arrays.get(n).size()-1) > max){
                    max=arrays.get(n).get(arrays.get(n).size()-1);
                }
            }
            return max-min;
        }

        public static void main(String[] args) {
            ArrayList<ArrayList<Integer>> arrays=new ArrayList<>();
            ArrayList<Integer> ar=new ArrayList<>();
            int arr1[]={1,2,3};


        }
    }

