public class RomanToInteger {
        public static int romanToInt(String s) {
            int num = 0;
            int i = 0;

            while(i<s.length()){
                if(s.charAt(i) == 'M'){
                    num += 1000;
                }else if(s.charAt(i) == 'C'){
                    num += 100;
                }else if(s.charAt(i) == 'L'){
                    num += 50;
                }else if(s.charAt(i) == 'X') {
                    num += 10;
                }else if(s.charAt(i) == 'V'){
                    num += 5;
                }else if(s.charAt(i) == 'I' && i+1 < s.length() && s.charAt(i+1) == 'V'){
                    num -= 1;
                }else if(s.charAt(i) == 'I' && i+1 < s.length() && s.charAt(i+1) == 'X'){
                    num -= 1;
                }else if(s.charAt(i) == 'I'){
                    num += 1;
                }

                i++;
            }
            return num;

        }

    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
}
