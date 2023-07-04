import java.util.Scanner;

public class StdinAndStdout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int myInteger = scan.nextInt();
        double myDouble = scan.nextDouble();
        scan.nextLine();
        String myString = scan.nextLine();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInteger);
        
        scan.close();
    }
}