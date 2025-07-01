package leetcode.string;

class sumoftwolargenumbers
{
    public static String sumoftwolargestrings(String s1, String s2)
    {
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = num1 + num2;

        return String.valueOf(sum);
    }
    public static void main(String args[])
    {
        String s1 = "23";
        String s2 = "25";

        System.out.println(sumoftwolargestrings(s1, s2));
    }
}