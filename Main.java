public class Main {

    // This is a function that adds two numbers

    public static int multi(int a, int b) {
        return a * b; // returns the sum of a and b
    }

    public static void main(String[] args) {
        int result = add(19, 10);
        int result_mult = multi(10, 4);
        System.out.println("multi is: " + result_mult); // Output: Sum is: 8

        System.out.println("Sum is: " + result); // Output: Sum is: 8
    }

}

