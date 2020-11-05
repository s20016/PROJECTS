package PGII_Java;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x > ");
        int x = scanner.nextInt();

        System.out.print("Enter y > ");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.printf("x > y \n");
        } else if (x < y) {
            System.out.printf("x < y \n");
        } else {
            System.out.printf("x = y \n");
        }
        
        scanner.close();
    }
}
