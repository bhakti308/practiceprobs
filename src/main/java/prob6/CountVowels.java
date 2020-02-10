package prob6;

import prob5.CharOccur;

import java.util.Scanner;

public class CountVowels {
    void DemoCount(String str){
        char[] inp = str.toCharArray();
        int vowels=0;
        int consonants=0;

        for(int i=0; i<str.length(); i++){
            if(inp[i] == 'a' || inp[i] == 'e' || inp[i] == 'i' || inp[i] == 'o' || inp[i] == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }

        System.out.println("Vowels = "+vowels+" and Consonants = "+consonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String: ");
        String str = scanner.next();

        CountVowels countVowels = new CountVowels();
        countVowels.DemoCount(str);
    }
}
