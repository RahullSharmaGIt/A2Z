import java.util.*;
public class ReverseLeftArray {
    public static void Reverse(int arr[], int start, int end){
        while( start<=end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }      
    public static void rotateLeftRight(int arr[], int n, int k){
        //reverse n-k elements
        Reverse(arr, 0, n-k-1);

        // reverse last k elemets
        Reverse(arr, n-k, n-1);

        // reverse whole array
        Reverse(arr, 0, n-1);
        
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 2;
        rotateLeftRight(arr, n, k);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

