package CodingQuestions;

public class ReverseWords {
        public static String reverseWordsRecursively(String[] words, int index) {
            if (index < 0) {
                return "";
            }

            String word = words[index];
            String ans = word+ " " + reverseWordsRecursively(words, index - 1);
            return ans;
        }

        public static void main(String[] args) {
            String s = "the sky is blue";
            String[] words = s.split(" ");
            String ans = reverseWordsRecursively(words, words.length - 1);
            System.out.println(ans);
        }
    }
