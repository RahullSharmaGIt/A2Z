public class Arraymain {
 
public static boolean isSorted(int[] arr, int n){
    for(int i=0; i<n; i++ ){
        for(int j = 0; j<i+1; j++){
            if(arr[j] < arr[i]){
                return false;
            }
        }
    }
    return true;
}

public static void main(String args[]){
    int arr[] = {1, 2, 3, 4, 5};  n=5;

    System.outprintln(isSorted(arr, n));
}
    
}
