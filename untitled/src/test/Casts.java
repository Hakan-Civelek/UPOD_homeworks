package test;

public class Casts {

    public static void main(String[] args) {
        // byte short ing long
        // float double
        long l = 500;
//        int a = l;

        int i = 3;
        l = i;

//        float f = 23.54;
        double d = 23.54;

        float ff = 23.54f;
        double dd = ff;

        new Object();

        byte b1 = 5;
        System.out.println("b1: " + b1);

        byte b2 = ++b1;
        System.out.println("b2: " + b2);

//        byte b3 = -b1;
//        System.out.println("b3: " + b3);

        long ll = 64;
        var v = ll >> 1;
        long test = v;
        System.out.println("test: " + test);

        int ii = 64;
        var vv = ii >> 1;
        int test2 = vv;
        System.out.println("\ntest2: " + test2);

        byte bb = 64;
        var vvv = bb >> 1;
//        byte test3 = vvv;
        byte test3 = (byte) vvv;
        System.out.println("\ntest3: " + test3);
    }
}
