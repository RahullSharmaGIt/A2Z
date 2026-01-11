public class getSingleElement {
    public static int getSingleElement(int[] arr) {
        // int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            num = arr[i];
            count = 0;
            for(int j<i; j<arr.length; j){
                if(arr[j] == num){
                    count++;
                }
            }
            if(count == 1){
                return num;
            }
        }
        
}

}
