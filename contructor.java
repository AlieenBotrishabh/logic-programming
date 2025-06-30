class constructor
{
    int a;
    constructor()
    {
        a = 10;
    }

    public static void display(int a)
    {
        System.out.println(a);
    }

    public static void main(String args[])
    {
        constructor ss = new constructor();
        display(ss.a);
    }
}