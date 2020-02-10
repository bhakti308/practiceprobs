package prob1;

import java.util.Scanner;

public class LeapYear {
    void checkLeapYear(int year){
        if(year%4 == 0)
        {
            System.out.println("Its a leap year!");
        }
        else{
            System.out.println("Not a leap year");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        LeapYear leapYear = new LeapYear();
        leapYear.checkLeapYear(year);

    }
}
