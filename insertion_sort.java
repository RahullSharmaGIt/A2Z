import java.util.*;

public class insertion_sort {
    public static void insertion_sorting(int n, int[] arr) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {

                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        System.err.println("after soring");
        for (int i = 0; i < n; i++) {
            System.err.println(arr[i] + " ");
        }
        System.err.println();
    }

    public static void main(String args[]) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sorting(n, arr);
    }

}

public class RecursionInsertion {
    public static void insertion(int[] arr, int i, int n) {
        if (i == n)
            return;
        j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertion(arr, i - 1, n);
    }
    
}
