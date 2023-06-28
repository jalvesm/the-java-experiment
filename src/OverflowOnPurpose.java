public class OverflowOnPurpose {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;            
        int result = maxValue + 1;
        System.out.println(maxValue + " + 1 " + " = " + result);
        System.out.println("Makes no sense, right?\n");

        System.out.println("Let's change the data type in order to solve this situation:");
        long result1 = (long) maxValue + 1;
        System.out.println( maxValue + " + 1 " + " = " + result1);
        System.out.println("Ok, now it makes sense!");
    }
}
