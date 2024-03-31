package test;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

//        traditionalSwitch();
//        multiUsingSwitch(month);
//        switchCaseWithArrow1();
//        switchCaseWithArrow2();
        switchCaseWithArrowAndBlocks();
    }

    private static void switchCaseWithArrowAndBlocks() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaçıncı ayda olduğunuzu girin: ");
        int month = scan.nextInt();
        String season = switch (month) {
            case 12, 1, 2 -> {
                System.out.println("Yield is working on 12, 1, 2!");
                yield "Winter";
            }
            case 3, 4, 5 -> {
                System.out.println("Yield is working on 3, 4, 5!");
                yield "Spring";
            }
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default ->
                    throw new IllegalStateException(" Unexpected value: " + month + ". Please enter the month number between 1 and 12");
        };
        System.out.println("Season is: " + season);
    }

    private static void switchCaseWithArrow2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nKaçıncı ayda olduğunuzu girin: ");
        int month = scan.nextInt();
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default ->
                    throw new IllegalStateException(" Unexpected value: " + month + ". Please enter the month number between 1 and 12");
        };
        System.out.println("Season is: " + season);
    }

    private static void switchCaseWithArrow1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nKaçıncı ayda olduğunuzu girin: ");
        int intMonth = scan.nextInt();
        String strMonth = switch (intMonth) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default ->
                    throw new IllegalStateException(" Unexpected value: " + intMonth + ". Please enter the month number between 1 and 12");
        };
        System.out.println(strMonth);
    }

    private static void multiUsingSwitch() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nKaçıncı ayda olduğunuzu girin: ");
        int month = scan.nextInt();
        switch (month) {
            case 12, 1, 2:
                System.out.println("Kış");
                break;
            case 3, 4, 5:
                System.out.println("İlkbahar");
                break;
            case 6, 7, 8:
                System.out.println("Yaz");
                break;
            case 9, 10, 11:
                System.out.println("Sonbahar");
                break;
        }
    }

    private static void traditionalSwitch() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nKaçıncı ayda olduğunuzu girin: ");
        String day = scan.nextLine();
        switch (day) {
            case "sunday":
                System.out.println("Pazar");
                break;
            case "monday":
                System.out.println("Pazartesi");
                break;
            case "tuesday":
                System.out.println("Salı");
                break;
            case "wednesday":
                System.out.println("Çarşamba");
                break;
            case "thursday":
                System.out.println("Perşembe");
                break;
            case "friday":
                System.out.println("Cuma");
                break;
            case "saturday":
                System.out.println("Cumartesi");
                break;
        }
    }
}
