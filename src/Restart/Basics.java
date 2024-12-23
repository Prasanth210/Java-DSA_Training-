package Restart;
import java.util.Scanner;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String str = scan.nextLine();
//        revrse_str(str);
//        System.out.println(factorial(5));
//        int[] arr = {12, 35, 1, 10, 34, 1};
//         arr_op(arr);
//        int n=scan.nextInt();
//        int[] val = new int[n];
//        for(int m=0;m<n;m++){
//            val[m]=scan.nextInt();
//        }
//        pushZerosToEnd(val);

//        zoho1("Hello for Zoho");
//        zoho2(9875);
//        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
//        zoho3(mat);
        int arr[]={1,2,3,4,5,6,7};
//        zoho4("aaabbccc");
//        Zoho6(arr);
//        zoho5("racecal");
//        int ar[]={1,2,3,4,5,6,8,9}; zoho7(ar,ar.length+1); //missing number
//        int [] arr={7,1,5,3,6,4};zoho8(arr);
//        zoho9(arr,2);
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//        int [] price={7,1,5,3,6,4};
//        Stock(price);
//        Zoho10(4);
         lengthOfLongestSubstring("abcabcbb");
        
    }


    static void Stock(int[] price){
        int profit=0;
        for(int n=1;n<price.length;n++){
            if(price[n]>price[n-1]){
                profit+=price[n]-price[n-1];
            }
        }
        System.out.println(profit);
    }
    static void Zoho10(int num){
        for(int n=1;n<=num;n++){
            for(int p=1;p<=num-n;p++){
                System.out.print(" ");
            }
            for(int p=1;p<=(2*n-1);p++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void zoho9(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    static void reverse(int [] array,int start,int end){
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }

    static void zoho8(int [] prices){
        int n= prices.length;
        int minprice=prices[0];
        int maxprofit=0;

        for(int i=1;i<n;i++){
            minprice=Math.min(minprice,prices[i]);
            maxprofit=Math.max(maxprofit,prices[i]-minprice);
        }
        System.out.println("Max profit is : "+maxprofit);
    }

    static void zoho7(int []arr,int len){
      int expect=len*(len+1)/2;
      int get=0;
      for(int n:arr){
          get+=n;
      }
        System.out.println(expect-get);

    }
    static void Zoho6(int[] arr){
        int len=arr.length;
        int mid=(len/2)-1;
        for(int n=mid;n>=0;n--){
            System.out.print(arr[n]+" ");
        }
        for(int n=arr.length-1;n>mid        ;n--){
            System.out.print(arr[n]+" ");
        }
    }

    static void zoho5(String str){
        int start=0,end=0;

        for(int n=0;n<str.length();n++){
            int odd= check(str,n,n);
            int even=check(str,n,n+1);

            int len=Math.max(odd,even);

            if(len > end-start){
                start=n-(len-1)/2;
                end=n+len/2;
            }
        }
        System.out.println(str.substring(start,end));
    }
    static int check(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left;
    }

    static void zoho4(String str){
        StringBuilder com=new StringBuilder();
        int n=1;
        for(int i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i+1) == str.charAt(i)  ){
                n++;
            }
            else{
                com.append(str.charAt(i));
                if(n>1){
                    com.append(n);
                }
                n=1;
            }

        }
        System.out.println(com.toString());
    }
    // spiral matrix
    static void zoho3(int[][] mat){
        int top=0,bottom=mat.length-1;
        int left=0,right=mat[0].length-1;

        while(left <= right && top <= bottom ){
            for(int n=left;n<=right;n++){
                System.out.print(mat[top][n]+" ");
            }
            top++;

            for(int n=top;n<=bottom;n++){
                System.out.print(mat[n][right]+" ");
            }
            right--;

            if(top<=bottom) {
                for (int n = right;n>=left;n-- ){
                    System.out.print(mat[bottom][n]+" ");
                }
                bottom--;
            }
            if(left <= right){
                for(int n=bottom;n>=top;n--){
                    System.out.print(mat[n][left]+" ");
                }
                left++;
            }
        }
    }

    static void zoho2(int num){
        int sum=0;
        while(num>0){
            int n=num%10;
            sum+=n;
            num=num/10;
        }
        if(sum>9) {
            zoho2(sum);
        }
        else {
            System.out.println(sum);
        }
    }
    static void zoho1(String str){
        StringBuilder s=new StringBuilder(str);
        System.out.println(s.reverse().toString());

        String st[]=str.split(" ");
        for(int n=st.length-1;n>=0;n--){
            System.out.print(st[n]+" ");
        }
        System.out.println();
    }

    static void revrse_str(String str){
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }
    static int factorial(int num){
        if(num == 0 || num == 1){
            return 1;
        }
        return num*factorial(num-1);
    }
    static void arr_op(int [] arr){
        int max1=0;
        int max=0;
        for(int n=0;n<arr.length;n++){
            for(int p=n+1;p<arr.length;p++){
                if(arr[p]>arr[n]){
                  max1=arr[p];
                }
            }
            if(max1>max){
                max=max1;
            }

        }
        System.out.println(max);
    }

    static void pushZerosToEnd(int[] arr) {
            // code here
            Arrays.sort(arr);

            if(arr[0] == 0){
                int count=0;
                for(int n=0;n<arr.length;n++){
                    if(arr[n] == 0){
                        count++;
                    }
                }
                if(count != arr.length){
                    for(int p=0;p<count;p++){
                        for(int n=0;n<arr.length;n++){
                            if(arr[n]!=0){
                                int temp=arr[n];
                                arr[n]=arr[n-1];
                                arr[n-1]=temp;
                            }
                        }
                    }
                }
            }
            for(int num:arr){
                System.out.print(num+" ");
            }
        }

       static void lengthOfLongestSubstring(String s) {
            Map<Character,Integer> hash=new HashMap<>();
            int max=0;
            int j=0;
            for(int i=0;i<s.length();i++){
                if (!hash.containsKey(s.charAt(i)) || hash.get(s.charAt(i)) < j) {
                    hash.put(s.charAt(i), i);
                    max = Math.max(max, i - j + 1);
                } else {
                    j = hash.get(s.charAt(i)) + 1;
                    hash.put(s.charAt(i), i);
                }

            }
           System.out.println(max);
        }
    }

