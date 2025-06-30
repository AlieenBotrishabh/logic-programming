package leetcode.string;

class FirstNonRepeating {
    public static char firstUnique(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) return str.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "sharhs";
        System.out.println(firstUnique(str)); // Output: 2 (index of 'a')
    }
}
