package Notes;
import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        int x = scanner.nextInt();

        System.out.println(Math.pow(x, 1));
        System.out.println(Math.pow(x, 3));
        System.out.println(Math.pow(x, 2));
        
        scanner.close();
    }
}
