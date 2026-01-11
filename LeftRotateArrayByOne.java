import java.util.Arrays;

public class LeftRotateArrayByOne {
    // Left rotate array by k positions with debug printing
    public static void solve(int[] arr, int n, int k) {
        System.out.println("Initial: " + Arrays.toString(arr)); // debug [start]
        if (n == 0) return; // nothing to do
        k = k % n; // normalize k
        System.out.println("Normalized k: " + k);

        if (k == 0) {
            System.out.println("No rotation needed.");
            return;
        }

        // 1) Save first k elements
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        System.out.println("Temp (first k): " + Arrays.toString(temp));

        // 2) Shift remaining n-k elements to the left by k
        // arr[k] -> arr, arr[k+1] -> arr[1], ...
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
            System.out.println("Shift step i=" + i + ": " + Arrays.toString(arr));
        }

        // 3) Put saved k elements at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
            System.out.println("Restore temp i=" + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Final: " + Arrays.toString(arr)); // debug [end]
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        solve(arr, n, k);
        System.out.println("Result: " + Arrays.toString(arr));
    }
}
