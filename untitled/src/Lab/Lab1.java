package Lab;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

//        example1();
        example2();
    }

    private static void example1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter tree numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int min = returnMin(returnMin(a, b), c);
        int max = returnMax(returnMax(a, b), c);
        int mid = a + b + c - (max + min);

        printValues(min, mid, max);
    }

    private static void printValues(int min, int mid, int max) {
        if (min < mid) {
            System.out.print(min + " < " + mid);
        } else {
            System.out.print(min + " = " + mid);
        }
        if (mid < max) {
            System.out.print(" < " + max);
        } else {
            System.out.print(" = " + max);
        }
    }

    private static int returnMax(int a, int b) {
        return a > b ? a : b;
    }

    private static int returnMin(int a, int b) {
        return a < b ? a : b;
    }

    private static void example2() {
        int mid;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter tree numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            mid = returnMid(a, b, c);

            if (a == -1 || b == -1 || c == -1) {
                break;
            }
            System.out.println("Mid: " + mid);
        }

    }

    private static int returnMid(int a, int b, int c) {
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            return b;
        }
        if ((a <= c && a <= b) || (c <= a && b <= c)) {
            return c;
        }
        return a;
    }
}
