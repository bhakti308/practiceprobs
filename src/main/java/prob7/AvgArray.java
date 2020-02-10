package prob7;

import java.util.Scanner;

public class AvgArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ar[] = new int[5];
        float sum=0;

        System.out.println("Enter 5 numbers: ");
        for(int i=0;i<5;i++){
            ar[i] = scanner.nextInt();
        }

        for(int i=0;i<5;i++){
            sum = sum + ar[i];
        }

        System.out.println("Avg = "+sum/5);

    }
}
