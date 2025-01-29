package Problems;

public class longest_palindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaabaaa"));
    }
        public static String longestPalindrome(String s) {
            if(s == null || s.length()<1) return "";
            int start=0,end=0;
            for(int n=0;n<s.length();n++){
                int len1 = expand(s,n,n);
                int len2 = expand(s,n,n+1);

                int len=Math.max(len1,len2);

                if(len > end-start){
                    start=n-((len-1)/2);
                    end=n+(len/2);
                }
            }
            return s.substring(start,end+1);

        }
        static int expand(String s,int start,int end){
            if(s == null || start>end) return 0;

            while(start>=0 && end< s.length() && s.charAt(end) == s.charAt(start)){
                start--;
                end++;
            }
            return end-start-1;

        }
    }
