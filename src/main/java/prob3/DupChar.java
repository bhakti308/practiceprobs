package prob3;

import java.util.Scanner;

public class DupChar {
    void checkDupChar(String str){
        char[] inp = str.toCharArray();

        for(int i=0; i < str.length(); i++)
        {
            for(int j=i+1;j < str.length(); j++)
            {
                if(inp[i] == inp[j]){
                System.out.println("Char "+inp[j]+" is repeated");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.next();

        DupChar dupChar = new DupChar();
        dupChar.checkDupChar(str);
    }
}
