class baseclass
{
    int a = 10;
}

class subclass extends baseclass
{
    void print()
    {
        System.out.println(a);
    }
}

class inheritance extends subclass
{
    public static void main(String args[])
    {
        subclass ss = new subclass();
        ss.print();
    }
}