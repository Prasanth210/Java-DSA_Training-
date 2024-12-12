package Problems;

public class Remove_dup {
    public static void main(String[] args) {
        String str = "aBuzZ9900";
        dup(str);  // Call the method here
    }

    static void dup(String str) {
        StringBuilder result = new StringBuilder();  // Use StringBuilder to store the result
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the current character is already in the result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);  // Append if not a duplicate
            }
        }
        System.out.println(result.toString());  // Print the final result
    }
}
