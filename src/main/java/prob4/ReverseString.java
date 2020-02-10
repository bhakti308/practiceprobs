package prob4;

import java.util.Scanner;

public class ReverseString {
     void DemoReverseString(String str){
         char[] inp = str.toCharArray();

         for(int i = str.length()-1; 0<=i; i-- ){
             System.out.print(inp[i]);
         }
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String str = scanner.next();

        ReverseString demo = new ReverseString();
        demo.DemoReverseString(str);
    }
}
