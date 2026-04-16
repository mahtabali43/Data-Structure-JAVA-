package Stack;
import java.util.Scanner;

// Step 1: Create Interface
interface StackOperations {
    void push(int data);
    void pop();
    void display();
    void count();
    void isFull();
    void isEmpty();
}

// Step 2: Implement the Interface
class StackArray implements StackOperations {
    int top;
    int max;
    int stack[];

    // Constructor
    StackArray(int size) {
        max = size;
        stack = new int[max];
        top = -1;
    }

    // Push operation
    public void push(int data) {
        if (top == max - 1) {
            System.out.println("Stack is FULL!");
        } else {
            top++;
            stack[top] = data;
            System.out.println(data + " pushed into stack.");
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is EMPTY!");
        } else {
            System.out.println(stack[top] + " popped from stack.");
            top--;
        }
    }

    // Display stack
    public void display() {
        if (top == -1) {
            System.out.println("Stack is EMPTY!");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Count elements
    public void count() {
        System.out.println("Number of elements in stack: " + (top + 1));
    }

    // Check if full
    public void isFull() {
        if (top == max - 1) {
            System.out.println("Stack is FULL!");
        } else {
            System.out.println("Stack is NOT FULL.");
        }
    }

    // Check if empty
    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is EMPTY!");
        } else {
            System.out.println("Stack is NOT EMPTY.");
        }
    }
}

// Step 3: Main Class with Menu
public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();

        StackArray s = new StackArray(size);

        int choice;
        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Display");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Count");
            System.out.println("5. Check if Full");
            System.out.println("6. Check if Empty");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    s.display();
                    break;

                case 2:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;

                case 3:
                    s.pop();
                    break;

                case 4:
                    s.count();

                case 5:
                    s.isFull();
                    break;

                case 6:
                    s.isEmpty();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}