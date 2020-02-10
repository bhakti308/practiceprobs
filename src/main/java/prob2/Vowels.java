package prob2;

import java.util.Scanner;

public class Vowels {
    void checkVowel(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            System.out.println("This character is a vowel.");
        }
        else{
            System.out.println("This character is not a vowel.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char a = scanner.next().charAt(0);

        Vowels vowels = new Vowels();
        vowels.checkVowel(a);
    }
}
