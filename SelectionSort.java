class SelectionSort
{
    public static void main(String args[])
    {
        int arr[] = {7, 8, 3, 1, 2};
        int n = arr.length;
        for(int i = 0;i < n - 1;i++)
        {
            int min = i;
            for(int j = i + 1;j < n;j++)
            {
                if(arr[min] > arr[j])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i = 0;i < n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}