package Codes;

import java.util.Scanner;

class testcode2 {
    
    private String Name;
    private int Age;

    public static void main(String [] args) {
        testcode2 MyDog = new testcode2();
        MyDog.SetAge(3);
        MyDog.SetName("ポチ");
        // MyDog.SetName("Pocchi");
        MyDog.ShowProfile();
    }

    public void SetName ( String nm ) {
        Name = nm;
    }

    public void SetAge ( int ag ) {
        Age = ag;
    }

    public void ShowProfile() {
    System.out.printf("名前は、%s, %d歳です。%n", Name, Age);
    System.out.printf("Name: %s, Age: %d", Name, Age);
    // System.out.println("日本語");
    }
}
