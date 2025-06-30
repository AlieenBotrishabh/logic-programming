package leetcode.string;

import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        String str = ss.nextLine();
        boolean ispalindrome = false;
        int n = str.length();
        for(int i = 0;i < n;i++)
        {
            for(int j = n - 1;j >= 0;j--)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    ispalindrome = true;
                }
                else
                {
                    ispalindrome = false;
                }
            }
        }
        if(ispalindrome == true)
        {
            System.out.println("Is Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}