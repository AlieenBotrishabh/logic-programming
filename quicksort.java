import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class quicksort {
    
    // Partition function that returns the pivot index
    public static int partition(ArrayList<Integer> arr, int start, int end) {
        int idx = start - 1;
        int pivot = arr.get(end);

        for (int j = start; j < end; j++) {
            if (arr.get(j) <= pivot) {
                idx++;
                Collections.swap(arr, j, idx);
            }
        }
        idx++;
        Collections.swap(arr, end, idx);
        return idx;
    }

    public static void quickSort(ArrayList<Integer> arr, int start, int end) {
        if (start < end) {
            int pividx = partition(arr, start, end);
            quickSort(arr, start, pividx - 1);
            quickSort(arr, pividx + 1, end);
        }
    }

    public static void main(String args[]) {
        Scanner ss = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int n = ss.nextInt(); // number of elements
        for (int i = 0; i < n; i++) {
            arr.add(ss.nextInt()); // input elements
        }
        
        quickSort(arr, 0, arr.size() - 1);

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
