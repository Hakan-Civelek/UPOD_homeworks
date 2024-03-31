import java.util.Scanner;

public class PiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı miktarını girin: ");
        int number = scanner.nextInt();
        double calculatedPi = 0;
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) calculatedPi += 4.0 / ((2.0 * i) + 1);
            else calculatedPi -= 4.0 / ((2.0 * i) + 1);
        }
        System.out.println("Calculated Pi: " + calculatedPi);
    }
}
