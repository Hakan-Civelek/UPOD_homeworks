package test;

import java.util.Scanner;

public class ShapePractices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the values: (Height - Width): ");
        int height = scan.nextInt();
        int width = scan.nextInt();
        String[][] starsForRectangle= new String[height][width];
        writeEmptyRectangle(starsForRectangle, height, width);
        writeFullRectangle(starsForRectangle, height, width);

        int heightOfTriangle = (width + 1) / 2;
        String[][] starsForTriangle = new String[heightOfTriangle][width];
        writeRightTriangle(starsForTriangle, heightOfTriangle, width);
        writeEquilateralTriangle(starsForTriangle, heightOfTriangle, width);
    }

//    0001000
//    0011100
//    0111110
//    1111111
    private static void writeEquilateralTriangle(String[][] stars, int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (((j - i) <= width / 2) && ((j + i) >= width / 2))
                    stars[i][j] = "*";
                else
                    stars[i][j] = " ";
            }
        }
        writeToShape(stars, height, width);
    }

    private static void writeRightTriangle(String[][] stars, int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (j < (2 * i) + 1)
                    stars[i][j] = "*";
                else
                    stars[i][j] = " ";
            }
        }
        writeToShape(stars, height, width);
    }

    private static void writeEmptyRectangle(String[][] stars, int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == width - 1 || j == 0)
                    stars[i][j] = "*";
                else
                    stars[i][j] = " ";
            }
        }
        writeToShape(stars, height, width);
    }

    private static void writeFullRectangle(String[][] stars, int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                stars[i][j] = "*";
            }
        }
        writeToShape(stars, height, width);
    }

    private static void writeToShape(String[][] stars, int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
