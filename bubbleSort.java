public class bubbleSort {
    static void bubble_sort(int n, int[] arr) {
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.err.println("After bubble sorting");
        for (int i = 0; i < n - 1; i++) {
            System.err.println(arr[i] + "");
        }
        System.err.println();

    }

    public static void main(String args[]) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;

        System.out.println("Before Using Bubble Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(n, arr);
    }
}
