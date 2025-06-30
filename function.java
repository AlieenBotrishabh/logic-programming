import java.util.Scanner;
class function
{
    public int oddoreven(int n)
    {
        int ans = 0;
        if(n % 2 == 0)
        {
            ans = 1;
        }
        else
        {
            ans = 0;
        }
        return ans;
    }

    public static void main(String args[])
    {
        function func = new function();
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = ss.nextInt();
        int ans = func.oddoreven(n);
        System.out.println(ans);

    }
}