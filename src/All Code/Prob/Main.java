public class Main {
    public static void main(String[] args) {
        String str = "Venkatesh";
        int count = 0;

        char[] c = str.toCharArray();
        for(char ch: c){
            count++;
        }

        System.out.println(count);
    }
}