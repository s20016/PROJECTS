package PGII_Java;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Age > ");
        int age = scanner.nextInt();

        System.out.printf("%d Days \n", age * 365);
        scanner.close();
    }
}
