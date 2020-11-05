package PGII_Java;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.printf("Add: %d \n", x + y);
        System.out.printf("Sub: %d \n", x - y);
        System.out.printf("Mul: %d \n", x * y);
        System.out.printf("Div: %d \n", x / y);
        System.out.printf("Rem: %d \n", x % y);

        scanner.close();
    }
}
