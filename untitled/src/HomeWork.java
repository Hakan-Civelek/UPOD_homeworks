import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Okunacak sayıyı girin: ");
        Integer number = scan.nextInt();
        numberReader(number);

        System.out.print("\nParçalanacak sayıyı girin: ");
        Long number2 = scan.nextLong();
        splitIntoThreeDigits(number2);

        Scanner scan2 = new Scanner(System.in);
        System.out.print("\nKelimeyi girin: ");
        String word = scan2.nextLine();
        if (checkIsItPalindrom(word)) {
            System.out.println("Kelime polindrom!");
        } else {
            System.out.println("Kelime polindrom değil!");
        }
    }

    private static boolean checkIsItPalindrom(String word) {
        boolean isItPalindrom = true;
        String specialCharacters = "! @#$%&*().,/\\<>?_+{}";
        StringBuilder editedWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (!specialCharacters.contains(String.valueOf(word.charAt(i)))) {
                editedWord.append(word.charAt(i));
            }
        }

        int length = editedWord.length();
        editedWord = new StringBuilder(editedWord.toString().toLowerCase());
        StringBuilder reversedWord = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            reversedWord.append(editedWord.charAt(i));
        }

        for (int i = 0; i < length; i++) {
            if (editedWord.charAt(i) != reversedWord.charAt(i)) {
                isItPalindrom = false;
                break;
            }
        }

        return isItPalindrom;
    }

    private static void splitIntoThreeDigits(Long number) {
        Long numberForSize = number;
        String strNumber = number.toString();
        int arraySize = 0;

        while (numberForSize > 0) {
            numberForSize /= 1000;
            arraySize++;
        }

        int[] result = new int[arraySize];

        for (int i = arraySize - 1; i >= 0; i--) {
            if (strNumber.length() >= 3) {
                result[i] = Integer.parseInt(strNumber.substring(strNumber.length() - 3));
                strNumber = strNumber.substring(0, strNumber.length() - 3);
            } else {
                result[i] = Integer.parseInt(strNumber);
                strNumber = "";
            }
        }
        System.out.print(number + " -> ");
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
    private static void numberReader(Integer number) throws Exception {
        String response = "";
        if (number == 0) {
            response = "Sıfır";
        }
        boolean isItNegative = false;
        if (number.toString().contains("-")) {
            number = Integer.parseInt(number.toString().substring(1));
            isItNegative = true;
        }

        if (number.toString().length() > 3) {
            throw new Exception("Sistem maksimum 3 basamaklı sayıları desteklemektedir!");
        }

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = (number / 100) % 10;

        int[] numberArray = new int[]{
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        String[] onesPlace = new String[]{
                "sıfır", "bir", "iki", "üç", "dört", "beş", "altı", "yedi", "sekiz", "dokuz"
        };
        String[] tensPlace = new String[]{
                "", "on", "yirmi", "otuz", "kırk", "elli", "altmış", "yetmiş", "seksen", "doksan"
        };
        String[] hundredsPlace = new String[]{
                "", "yüz", "ikiyüz", "üçyüz", "dörtyüz", "beşyüz", "altıyüz", "yediyüz", "sekizyüz", "dokuzyüz"
        };

        if (isItNegative) {
            response += "eksi";
        }

        if (hundreds != 0) {
            for (int i = 0; i < numberArray.length; i++) {
                if (hundreds == numberArray[i]) {
                    response += hundredsPlace[i];
                    break;
                }
            }
        }

        if (tens != 0) {
            for (int i = 0; i < numberArray.length; i++) {
                if (tens == numberArray[i]) {
                    response += tensPlace[i];
                    break;
                }
            }
        }

        if (ones != 0) {
            for (int i = 0; i < numberArray.length; i++) {
                if (ones == numberArray[i]) {
                    response += onesPlace[i];
                    break;
                }
            }
        }

        System.out.println((isItNegative ? "-" : "") + number + " -> " + response);
    }
}
