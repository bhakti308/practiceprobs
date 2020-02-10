package prob16;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        int num, temp, digit, count = 0;

        //getting the number from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number:");
        num = scanner.nextInt();

        temp = num;

        while(num > 0)
        {
            num = num / 10;
            count++;
        }
        while(temp > 0)
        {
            digit = temp % 10;
            System.out.println("Digit at place "+count+" is: "+digit);
            temp = temp / 10;
            count--;
        }
    }
}
