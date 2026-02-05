import java.util.*;

class Prac1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("Choose Method:");
        System.out.println("1. Iterative Method");
        System.out.println("2. Recursive Method");
        System.out.print("Enter Choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {
            fibIterative(n);
        } else if (ch == 2) {
            System.out.println("Fibonacci Series (Recursive):");
            for (int i = 0; i < n; i++) {
                System.out.print(fibRecursive(i) + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }

    // Iterative method
    static void fibIterative(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series (Iterative):");
        if (n >= 1)
            System.out.print(first + " ");
        if (n >= 2)
            System.out.print(second + " ");

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
    }

    // Recursive method
    static int fibRecursive(int n) {
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }
}
