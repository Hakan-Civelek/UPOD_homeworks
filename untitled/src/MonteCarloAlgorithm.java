public class MonteCarloAlgorithm {
    public static void main(String[] args) {
        calculatePi(100000000);
    }

    private static void calculatePi(long number) {
        long inPoints = 0;
        long start = System.currentTimeMillis();
        for (long i = 0; i < number; i++) {
            double x = Math.random();
            double y = Math.random();
            if (((x * x) + (y * y)) <= 1) {
                inPoints++;
            }
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Calculated Pi: " + (float) (4 * inPoints) / number + " and it's calculated on " + time + " milliseconds");
        System.out.println("    Java's Pi: " + Math.PI);
    }
}
