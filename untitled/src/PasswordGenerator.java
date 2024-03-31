import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.print("Şifre uzunluğunu girin: ");
        Scanner scanner = new Scanner(System.in);
        int uzunluk = scanner.nextInt();
        scanner.nextLine();
        String password;

        System.out.print("Şifrede büyük harf içermeli mi? (evet/hayır): ");
        boolean buyukHarfVarMi = scanner.nextLine().equalsIgnoreCase("e");


        System.out.print("Şifrede küçük harf içermeli mi? (evet/hayır): ");
        boolean kucukHarfVarMi = scanner.nextLine().equalsIgnoreCase("e");


        System.out.print("Şifrede sayı içermeli mi? (evet/hayır): ");
        boolean sayiVarMi = scanner.nextLine().equalsIgnoreCase("e");


        System.out.print("Şifrede özel karakter içermeli mi? (evet/hayır): ");
        boolean ozelKarakterVarMi = scanner.nextLine().equalsIgnoreCase("e");

//        while (true) {
//            password = createPassword(uzunluk, buyukHarfVarMi, kucukHarfVarMi, sayiVarMi, ozelKarakterVarMi);
//            System.out.println("password: " + password);
//            System.out.println("Parolayı begendiniz mi? ( Evet icin 'e' hayır icin 'h' ye basın)");
//            String check = scanner.nextLine();
//
//            if (check.equals("e")) {
//                try (FileWriter writer = new FileWriter("password.txt")) {
//                    writer.write(password);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                break;
//            }
//        }

        while (true) {
            password = createRandomPassword(uzunluk, buyukHarfVarMi, kucukHarfVarMi, sayiVarMi, ozelKarakterVarMi);
            boolean valid = checkIsItValid(password, buyukHarfVarMi, kucukHarfVarMi, sayiVarMi, ozelKarakterVarMi);
            System.out.println("password: " + password);
            if (valid) {
                System.out.println("Parolayı begendiniz mi? ( Evet icin 'e' hayır icin 'h' ye basın)");
                String check = scanner.nextLine();

                if (check.equals("e")) {
                    try (FileWriter writer = new FileWriter("password.txt")) {
                        writer.write(password);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
    }

    private static boolean checkIsItValid(String password, boolean buyukHarfVarMi, boolean kucukHarfVarMi, boolean sayiVarMi, boolean ozelKarakterVarMi) {
        String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
        String NUMS = "1234567890";
        String SPECIAL = "!@#$%&*()./\\<>?_+{}";

        boolean valid = true;
        if (buyukHarfVarMi) {
            if (!password.matches(".*[" + UPPER_CASE + "].*")) {
                valid = false;
            }
        } else if (!buyukHarfVarMi) {
            if (password.matches(".*[" + UPPER_CASE + "].*")) {
                valid = false;
            }
        }
        if (kucukHarfVarMi) {
            if (!password.matches(".*[" + LOWER_CASE + "].*")) {
                valid = false;
            }
        } else if (!kucukHarfVarMi) {
            if (password.matches(".*[" + LOWER_CASE + "].*")) {
                valid = false;
            }
        }
        if (sayiVarMi) {
            if (!password.matches(".*[" + NUMS + "].*")) {
                valid = false;
            }
        } else if (!sayiVarMi) {
            if (password.matches(".*[" + NUMS + "].*")) {
                valid = false;
            }
        }
        if (ozelKarakterVarMi) {
            if (!password.matches(".*[" + SPECIAL + "].*")) {
                valid = false;
            }
        } else if (!ozelKarakterVarMi) {
            if (password.matches(".*[" + SPECIAL + "].*")) {
                valid = false;
            }
        }
        return valid;
    }

    private static String createRandomPassword(int uzunluk, boolean buyukHarfVarMi, boolean kucukHarfVarMi, boolean sayiVarMi, boolean ozelKarakterVarMi) {
        String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
        String NUMS = "1234567890";
        String SPECIAL = "!@#$%&*()./\\<>?_+{}";
        String AllCharacters = SPECIAL + NUMS + LOWER_CASE + UPPER_CASE;
        String password = "";
        for (int i = 0; i < uzunluk; i++) {
            password += selectRandom(AllCharacters);
        }
        return password;
    }

    static String createPassword(int uzunluk, boolean buyukHarfVarMi, boolean kucukHarfVarMi, boolean sayiVarMi, boolean ozelKarakterVarMi) {
        String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
        String NUMS = "1234567890";
        String SPECIAL = "!@#$%&*()./\\<>?_+{}";
        String AllCharacters = "";
        String password = "";

        if (buyukHarfVarMi) {
            password += selectRandom(UPPER_CASE);
            AllCharacters += UPPER_CASE;
        }
        if (kucukHarfVarMi) {
            password += selectRandom(LOWER_CASE);
            AllCharacters += LOWER_CASE;
        }
        if (sayiVarMi) {
            password += selectRandom(NUMS);
            AllCharacters += NUMS;
        }
        if (ozelKarakterVarMi) {
            password += selectRandom(SPECIAL);
            AllCharacters += SPECIAL;
        }

        int length = password.length();
        for (int i = 0; i < (uzunluk - length); i++) {
            password += selectRandom(AllCharacters);
        }

        return password;
    }

    private static char selectRandom(String characters) {
        char response;
        Random random = new Random();
        int randomSayi = random.nextInt(characters.length());
        response = characters.charAt(randomSayi);
        return response;
    }
}