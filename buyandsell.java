import java.util.*;
public class buyandsell {

    public static int maxProfit(int[] arr) {
        int maxPro = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }

            }
        }
        return maxPro;
    }

    public static void main(String[] args) {   
        int arr[] = { 7, 1, 5, 3, 6, 4 };
        int maxPro = maxProfit(arr);
        System.out.println("max profit "+ maxPro);
    }

}
