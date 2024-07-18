public class Main {
   static StringBuilder newWord = new StringBuilder();
    public static void printWord(String word, int i, boolean[] map){
        if(i == word.length()){
            return;
        }
        char currChar = word.charAt(i);

        if(map[currChar-'a'] == true){
            //duplicate
            printWord(word,i+1,map);
        }else{
            map[currChar-'a'] = true;
            newWord.append(currChar);
            printWord(word,i+1,map);
        }
    }

    public static void main(String[] args) {
        String word = "hello";
        boolean[] map = new boolean[26];

        printWord(word,0,map);
        System.out.println(newWord);


    }
}