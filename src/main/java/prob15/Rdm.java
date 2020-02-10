package prob15;

import java.util.Random;

public class Rdm {
    public static void main(String[] args) {
        Random t = new Random();

        // random integers in [0, 100]

        for (int c = 1; c <= 10; c++) {
            System.out.println(t.nextInt(100));
        }
    }
}
