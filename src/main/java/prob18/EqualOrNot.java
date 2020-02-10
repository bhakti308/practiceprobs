package prob18;

import java.util.Scanner;

public class EqualOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a==b && b==c)
            System.out.println("All three numbers are equal");
        else if(a!=b && b!=c && a!=c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all are equal or different");
    }
}
