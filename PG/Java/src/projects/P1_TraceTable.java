package projects;

public class P1_TraceTable {

    public static void main(String[] args) {

        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
    }

    // pattern 1
    static void pattern1(int x) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // pattern 2
    static void pattern2(int x) {
        for (int i = x; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // pattern 3
    static void pattern3(int x) {
        for (int i = x; i > 0; i--) {
            for (int j = x; j > x - i + 1; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= x - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // pattern 4
    static void pattern4(int x) {
        for (int i = x; i > 0; i--) {
            for (int k = 0; k < x - i; k++) {
                System.out.print("  ");
            }
            for (int j = x; j >= x - i + 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // pattern 5
    static void pattern5(int x) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = x - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    // pattern 6
    static void pattern6(int x) {
        for (int i = x; i > 0; i--) {
            for (int k = 0; k < x - i; k++) {
                System.out.print(" ");
            }
            for (int j = x; j >= x - i + 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}