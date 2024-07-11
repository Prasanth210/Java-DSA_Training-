package Problems;

// Leetcode  17. Letter Combinations of a Phone Number

public class Letter_combination {
    static final String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        String digits = "23";
        Combinations(digits, 0, "");
    }

    static void Combinations(String digits, int index, String current) {
        if (index == digits.length()) {
            System.out.print(current+" ");
            return;
        }
        int digit=Integer.parseInt(String.valueOf(digits.charAt(index)));
        String letters = keypad[digit];
        for (int i = 0; i < letters.length(); i++) {
            Combinations(digits, index + 1, current + letters.charAt(i));
        }
    }
}
