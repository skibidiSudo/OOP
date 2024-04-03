package hus.oop.homework1;

import java.util.Scanner;

public class StringAndCharacterHomework {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //testExchangeCipher();
        //testPalindromicWord();
        testPalindromicPhrase();
    }
    public static String exchangeCipher(String inStr){

        String outpStr = "";
        for (int i = 0; i < inStr.length(); i++){
            char plainTextChar = inStr.charAt(i);
            char cipherTextChar = (char) ('A' + 'Z' - plainTextChar);
            outpStr += cipherTextChar;
        }
        return outpStr;
    }
    public static void testExchangeCipher(){
        System.out.print("Enter the plaintext string: ");
        String inStr = sc.nextLine().toUpperCase();
        System.out.println("The ciphertext string is: " + exchangeCipher(inStr));
    }
    public static boolean isPalindromicWord(String inStr){
        for (int firstI = 0, lastI = inStr.length() - 1; firstI < lastI; firstI++){
            if (inStr.charAt(firstI) != inStr.charAt(lastI))
                return false;
            lastI--;
        }
        return true;
    }
    public static void testPalindromicWord(){
        System.out.print("Enter the word: ");
        String inStr = sc.nextLine();
        if(isPalindromicWord(inStr.toUpperCase()))
            System.out.println(inStr + " is a palindrome");
        else
            System.out.println(inStr + " is not a palindrome");
    }
    public static boolean isPalindromicPhrase(String phrase){
        phrase = phrase.toLowerCase().replaceAll("[^a-z]", "");
        for (int firstI = 0, lastI = phrase.length() - 1; firstI < lastI; firstI++){
            if (phrase.charAt(firstI) != phrase.charAt(lastI))
                return false;
            lastI--;
        }
        return true;
    }
    public static void testPalindromicPhrase(){
        System.out.print("Enter the phrase: ");
        String pharse = sc.nextLine();
        if (isPalindromicPhrase(pharse))
            System.out.println(pharse + " is palindrome phrase");
        else
            System.out.println(pharse + " is not palindrome phrase");
    }
}
