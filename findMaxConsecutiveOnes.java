public class findMaxConsecutiveOnes {
    static int solve(int num[]) {
        int count = 0;
        int max_count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            max_count = Math.max(max_count, count);
        }
        return max_count;

    }

    public static void main(String[] args) {
        int num[] = { 1, 1, 0, 1, 1, 1 };
        int ans = solve(num);
        
        System.out.println("The maximum  consecutive 1's are " + ans);

    }
}

// If  the value at the current index is equal to 1 we increase the value of count by one. After updating  the count variable if it becomes more than the max_count  update the max_count.
    // If the value at the current index is equal to zero we make the variable count as 0 since there are no more consecutive ones.
    