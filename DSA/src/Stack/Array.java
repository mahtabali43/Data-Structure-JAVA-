package Stack;

import java.util.Scanner;

public class Array {

    // Function to display array
    public static void display(int arr[]) {
        System.out.println("Array elements are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Function to reverse array
    public static void reverse(int arr[]) {
        System.out.println("Reversed array:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to replace nth element
    public static void replace(int arr[], int n, int value) {
        if (n >= 0 && n < arr.length) {
            arr[n] = value;
            System.out.println("Updated array:");
            display(arr);
        } else {
            System.out.println("Invalid position!");
        }
    }

    // Function to find sum
    public static void sum(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Sum of elements: " + sum);
    }

    // Function to find maximum
    public static void max(int arr[]) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Maximum element: " + max);
    }

    // Function to find average
    public static void average(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Average: " + avg);
    }

    // Function to display even and odd numbers
    public static void evenOdd(int arr[]) {
        System.out.print("Even numbers: ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.print("Odd numbers: ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Initialize array
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display array");
            System.out.println("2. Reverse array");
            System.out.println("3. Replace nth element");
            System.out.println("4. Sum of elements");
            System.out.println("5. Maximum element");
            System.out.println("6. Average");
            System.out.println("7. Even and Odd elements");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    display(arr);
                    break;
                case 2:
                    reverse(arr);
                    break;
                case 3:
                    System.out.print("Enter index to replace (0-based): ");
                    int index = sc.nextInt();
                    System.out.print("Enter new value: ");
                    int value = sc.nextInt();
                    replace(arr, index, value);
                    break;
                case 4:
                    sum(arr);
                    break;
                case 5:
                    max(arr);
                    break;
                case 6:
                    average(arr);
                    break;
                case 7:
                    evenOdd(arr);
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}