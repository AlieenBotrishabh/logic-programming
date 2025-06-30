class Stack
{
    int capacity;
    int top;
    int arr[];
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Overflow");
        }
        else
        {
            System.out.println(data);
            arr[++top] = data;
        }
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            return -1;
        }
        return arr[top--];
    }
    public boolean isFull()
    {
        if(top == capacity - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Stack ss = new Stack(14);
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);
    }
}