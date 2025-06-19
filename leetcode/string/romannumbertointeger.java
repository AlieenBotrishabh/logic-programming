package leetcode.string;
import java.util.Scanner;
import java.util.HashMap;

class romannumbertointeger
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        String str = ss.nextLine();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int previous = 0;
        for(int i = str.length() - 1;i >= 0;i--)
        {
            int curr = map.get(str.charAt(i));
            if(curr < previous)
            {
                result = result - curr;
            }
            else
            {
                result = result + curr;
            }
            previous = curr;
        }
        System.out.println(result);
    }
}