package test;

public class TestClass3 {
    public static void main(String[] args) {
//        int i = 2 * 19 % 2;
//        int i = 5, j = 8;
//        i += ++j;
//        int i = 7;
//        int j = 5;
//        int k = i + (i > 6 ? ++j : --j);
//        int i = 22;
//        boolean b = i >= 12 && i < 29;
//        boolean b1 = false;
//        int y = 10;
//        boolean b2 = (y != 5) ^ (b1 = false);
        int i = 5;
//        i += i++;
        i = i + i++;
        i = i + ++i;
        int j = 7;
        int k = 9;
        k += j++;
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("k: " + k);
//        int j = i;
    }
}