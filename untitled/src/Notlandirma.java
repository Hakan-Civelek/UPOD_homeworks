import java.util.Scanner;

public class Notlandirma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Öğrenci sayısını girin:");
        int studentCount = scanner.nextInt();

        for (int i = 0; i < studentCount; i++) {
            int firstExam, secondExam;
            System.out.println("Öğrenci " + (i+1) + ":");
            System.out.print("Adı:");
            String studentName = scanner.next();
            do {
                System.out.print("Vize Notu (0-100 arası): ");
                firstExam = scanner.nextInt();
            } while (firstExam < 0 || firstExam > 100);
            do {
                System.out.print("Final Notu (0-100 arası): ");
                secondExam = scanner.nextInt();
            } while (secondExam < 0 || secondExam > 100);
            double averageScore = calculateAverageScore(firstExam, secondExam);
            String gpa = calculateGPA(averageScore);
            printInformations(averageScore, gpa);
        }
    }

    private static double calculateAverageScore(int firstExam, int secondExam) {
        return (firstExam * 0.4) + (secondExam * 0.6);
    }

    private static void printInformations(double averageScore, String gpa) {
        System.out.println(averageScore + " - " + gpa);
    }

    private static String calculateGPA(double result) {
        if (result >= 90) {
            return "AA";
        } else if (result >= 80) {
            return "BA";
        } else if (result >= 70) {
            return "BB";
        } else if (result >= 60) {
            return "CB";
        } else if (result >= 50) {
            return "CC";
        } else if (result >= 40) {
            return "DC";
        } else if (result >= 30) {
            return "DD";
        } else {
            return "FF";
        }
    }
}