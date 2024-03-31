import java.util.Scanner;

public class StringWithStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kelime:");
        String word = scanner.nextLine();
        String editedWord = convertToStringWithStars(word);
        System.out.println(editedWord);
    }

    private static String convertToStringWithStars(String word) {
        String result = "";
        for (int i = 0; i < word.length() - 1; i++) {
            if (checkIsItValidForStar(word.charAt(i), word.charAt(i + 1))) {
                result += word.charAt(i) + "*";
            } else {
                result += word.charAt(i);
            }
        }
        result += word.charAt(word.length() - 1);
        return result;
    }

    private static boolean checkIsItValidForStar(char charOne, char charTwo) {
        char[] invalidChars = {' ', '.', ','};
        for (char character : invalidChars) {
            if (charOne == character || charTwo == character) return false;
        }
        return true;
    }
}