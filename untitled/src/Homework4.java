import java.sql.Array;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        printIsItPrime();
        printFibonacci();
        printIsItPerfect();
    }

    private static void printIsItPrime() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean isPrime = true;
            System.out.print("Bir sayı girin (Çıkmak için sıfır(0) girin):");
            int number = scanner.nextInt();
            if (number == 0) break;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " bir asal sayıdır");
            } else {
                System.out.println(number + " asal sayı değildir");
            }
        }
    }

    private static void printFibonacci() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nFibonacci serisinin kaç terimini görmek istersiniz? (Çıkmak için sıfır(0) girin):");
            int number = scanner.nextInt();
            if (number == 0) break;
            int[] fibonacciNumbers = new int[number];

            fibonacciNumbers[0] = 0;
            if (number >= 2) {
                fibonacciNumbers[1] = 1;
            }
            for (int i = 2; i < number; i++) {
                fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
            }
            for (int value : fibonacciNumbers) {
                System.out.print(value + " ");
            }
        }
    }

    private static void printIsItPerfect() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int total = 0;
            System.out.print("\nBir sayı girin (Çıkmak için sıfır(0) girin):");
            int number = scanner.nextInt();
            if (number == 0) break;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }

            if (total == number) {
                System.out.println(number + " bir mükemmel sayıdır");
            } else {
                System.out.println(number + " mükemmel sayı değildir");
            }
        }
    }
}
