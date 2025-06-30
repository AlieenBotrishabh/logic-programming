package leetcode.string;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Isomorphic {
    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        String str1 = ss.nextLine();
        String str2 = ss.nextLine();

        boolean result = isIsomorphic(str1, str2);
        System.out.println(result);
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> mapped = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } else {
                if (mapped.contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
                mapped.add(c2);
            }
        }
        return true;
    }
}
