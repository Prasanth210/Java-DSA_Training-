package Problems;
/*  1624. Largest Substring Between Two Equal Characters
Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.

A substring is a contiguous sequence of characters within a string.
 */
import java.util.Arrays;
public class Leet_1624 {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int firstIndex[] = new int[26];
        Arrays.fill(firstIndex, -1);
        int max = -1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(firstIndex[c - 'a'] == -1){
                firstIndex[c - 'a'] = i;
            }
            else{
                max = Math.max(max, i - firstIndex[c - 'a'] - 1);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
    }
}
