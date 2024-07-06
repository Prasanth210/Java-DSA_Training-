package Sorting_Algorithm;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr1={6,8,5,9,10,2,7,4};
        int[] arr2={8,7,1,2,9,6,3,4};

        for(int i=1;i<arr1.length;i++){
           int key=arr1[i];
           int j=i-1;

           while(j>=0 && arr1[j]>key){
               arr1[j+1]=arr1[j];
               j=j-1;
           }
           arr1[j+1]=key;
        }

        for(int i=1;i<arr2.length;i++){
            int key=arr2[i];
            int j=i-1;

            while(j>=0 && arr2[j]>key){
                arr2[j+1]=arr2[j];
                j=j-1;
            }
            arr2[j+1]=key;
        }
//        for(int i=0;i<arr2.length;i++) {
//            System.out.print(arr1[i]+" ");
//        }
//       2 4 5 6 7 8 9 10
//       1 2 3 4 6 7 8 9
        merge_two_sarray(arr1,arr2);
    }
    public static void merge_two_sarray(int [] one,int[] two){
        int[] merge=new int[one.length+two.length];
        int i=0,j=0,k=0;

        while(i<one.length && j<two.length){
            if(one[i] < two[j]){
                merge[k]=one[i];
                i++;
            }
            else{
                merge[k]=two[j];
                j++;
            }
            k++;
        }

        while (i < one.length) {
            merge[k] = one[i];
            i++;
            k++;
        }
        while(i < two.length){
            merge[k]=two[j];
            j++;
            k++;
        }

        for(int m=0;m<merge.length;m++){
            System.out.print(merge[m]+" ");
        }
    }
}
