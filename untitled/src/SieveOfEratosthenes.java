import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı girin: ");
        int number = scanner.nextInt();
        int pointer = 0;
        int[][] primeNumbers = new int[number - 1][2];
        for (int i = 0; i < number - 1; i++) {
            primeNumbers[i][0] = i + 2;
            primeNumbers[i][1] = 1;
        }

        for (int i = pointer; i < Math.sqrt(number); i++) {
            boolean isPointerChanged = false;
            for (int j = pointer + 1; j < number - 1; j++) {
                if (primeNumbers[j][0] % primeNumbers[i][0] == 0) {
                    primeNumbers[j][1] = 0;
                } else if (!isPointerChanged) {
                    pointer = j;
                    isPointerChanged = true;
                }
            }
        }

        for (int i = 0; i < number - 1; i++) {
            if (primeNumbers[i][1] == 1) {
                System.out.print(primeNumbers[i][0] + " ");
            }
        }
    }
}
