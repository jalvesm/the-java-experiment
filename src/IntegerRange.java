public class IntegerRange {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;

        long range = (long) maxValue - (long) minValue;
        System.out.println("So given that, Java works with a total of " + range + " integers.\n");
    }
}
