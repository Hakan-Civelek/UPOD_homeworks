import java.util.Scanner;

public class Fotokopi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayfa sayısı:");
        int pageCount = scanner.nextInt();
        double price = calculatePrice(pageCount);
        double recursivePrice = recursiveCalculatePrice(pageCount);
        System.out.println("price: " + price);
        System.out.println("recursivePrice: " + recursivePrice);
    }

    private static double recursiveCalculatePrice(int pageCount) {
        if (pageCount / 25 > 0) {
            return (pageCount / 25) + recursiveCalculatePrice(pageCount % 25);
        } else if (pageCount / 12 > 0) {
            return (0.5 * (pageCount / 12)) + recursiveCalculatePrice(pageCount % 12);
//            return (0.5 * pageCount / 12) + recursiveCalculatePrice(pageCount % 12); //TODO yukarıdaki parantezin oluşturduğu farkı unutma!
        } else if (pageCount > 0) {
            return (0.05 * pageCount);
        }
        return 0;
    }

    static double calculatePrice(int pageCount) {
        double price = 0;
        if (pageCount / 25 > 0) {
            price += (pageCount / 25);
            pageCount = pageCount % 25;
        }
        if (pageCount / 12 > 0) {
            price += 0.5 * (pageCount / 12);
            pageCount = pageCount % 12;
        }
        price += 0.05 * pageCount;
        return price;
    }
}
