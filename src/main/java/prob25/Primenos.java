package prob25;

import java.util.Scanner;

public class Primenos {
    public static void main(String[] args) {
        int state = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();

        for(int i=2;i<num;i++){
            if(num%i == 0)
                state++;
        }

        if(state == 0)
            System.out.println("It is a prime number.");
        else
            System.out.println("It is not a prime number");
    }
}
