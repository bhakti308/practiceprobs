package prob5;

import java.util.Scanner;

public class CharOccur {
    void checkCharOccur(String str, char input){
        char inp[] = str.toCharArray();
        int state = 0;
        int state2;

        for(int i=0; i<str.length(); i++){
            if(inp[i] == input){
                System.out.println("The Character Occurs");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = scanner.next();
        System.out.println("Enter Character");
        char input = scanner.next().charAt(0);

        CharOccur charOccur = new CharOccur();
        charOccur.checkCharOccur(str, input);
    }
}
