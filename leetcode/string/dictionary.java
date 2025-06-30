package leetcode.string;

public class dictionary {

    // Helper method to check if 'word' is a subsequence of 's'
    public static boolean isSubsequence(String word, String s) {
        int i = 0, j = 0;
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == word.length();
    }

    public static void main(String[] args) {
        String[] dictionary = {"ale", "apple", "monkey", "plea"};
        String s = "abpcplea";
        String largest = "";

        for (String word : dictionary) {
            if (isSubsequence(word, s)) {
                // Update if longer, or same length but lexicographically smaller
                if (word.length() > largest.length() ||
                   (word.length() == largest.length() && word.compareTo(largest) < 0)) {
                    largest = word;
                }
            }
        }

        System.out.println(largest);
    }
}
