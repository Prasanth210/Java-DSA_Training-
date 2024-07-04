package Oops;

public class Array_Rec {
        public static void main(String args[]){
            int []arr={10,20,30,40,50,80};
            int l=arr.length-1;
            arraydisp(arr,l);
            arraymax(arr,l);

        }
        public static void arraydisp(int [] arr,int l){
            if(l!=-1){
                arraydisp(arr,l-1);
                System.out.println(arr[l]);
            }

        }
    public static void arraymax(int [] arr,int l) {
       int max=arr[0];

    }
    }

