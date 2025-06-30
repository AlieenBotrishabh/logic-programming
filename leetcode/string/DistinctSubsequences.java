package leetcode.string;
import java.util.*;

public class DistinctSubsequences {
    public int countDistinctSubseq(String S) {
        int mod = 1_000_000_007;
        int n = S.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Empty subsequence

        Map<Character, Integer> last = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            char c = S.charAt(i - 1);
            dp[i] = (2 * dp[i - 1]) % mod;

            if (last.containsKey(c)) {
                dp[i] = (dp[i] - dp[last.get(c) - 1] + mod) % mod;
            }
            last.put(c, i);
        }
        // Subtract 1 to exclude the empty subsequence
        return dp[n];
    }

    public static void main(String[] args) {
        DistinctSubsequences ds = new DistinctSubsequences();
        System.out.println(ds.countDistinctSubseq("gfg")); // Output: 7
        System.out.println(ds.countDistinctSubseq("ggg")); // Output: 4
    }
}
