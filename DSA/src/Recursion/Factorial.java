package Recursion;

public class Factorial {

    static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int num = 6;
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}