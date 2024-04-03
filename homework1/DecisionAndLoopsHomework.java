package hus.oop.homework1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class DecisionAndLoopsHomework {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //guessNumber();
        guessWord();
    }
    public static void guessNumber(){
        final int SECRET_NUMBER = (int) (Math.random()*100);
        guessNumber(SECRET_NUMBER, sc);
    }
    public static void guessNumber(int number, Scanner in){
        System.out.println("key in you guess:");
        int numberGuess = in.nextInt();
        int countTrial = 1;
        while (numberGuess != number){
            if (numberGuess < number) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
            numberGuess = in.nextInt();
            countTrial++;
        }
        System.out.println("You got it in "+countTrial+" trials !");
    }
    public static void guessWord(){
        int countWord = 0;
        ArrayList<String> arrWord = new ArrayList<>();
        try {
            File file = new File("D:/IJ/OOP/src/hus/oop/homework1/data.txt");
            Scanner in = new Scanner(file);
            while (in.hasNext()){
                String inStr = in.next();
                arrWord.add(inStr);
                countWord++;
            }
            in.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        Random rand = new Random();
        int idxWord = rand.nextInt(countWord);
        guessWord(arrWord.get(idxWord).toLowerCase(), sc);
        /*System.out.print("Enter the word to guess: ");
        String inpStr = sc.nextLine();*/
    }

    public static void guessWord(String guessedString, Scanner in){
        System.out.println();
        System.out.println("Let's guess the word (the word has length " + guessedString.length() + ")");
        boolean[] checkEachCharacter = new boolean[guessedString.length()];
        for (int i = 0; i < guessedString.length(); i++)
            checkEachCharacter[i] = false;

        boolean check = false;
        int countTrial = 1;

        while (!check) {
            System.out.print("Key in one character or your guess word: ");
            String guessChar = in.nextLine();

            while (guessChar.length() > 1) { //Nếu nhập 1 từ
                if (guessChar.equals(guessedString)) {
                    System.out.println("Congratulation!");
                    System.out.println("You got it in " +countTrial+ " trial");
                    check = true;
                    break;
                } else if ((guessChar.length() >= guessedString.length()) && (!guessChar.equals(guessedString))) {
                    System.out.println("The word you guessed wrong! Try again!");
                    System.out.print("Key in one character or your guess word: ");
                    guessChar = in.nextLine();
                    countTrial++;
                } else {
                    System.out.println("Please enter 1 character or expected word! Try again!");
                    System.out.print("Key in one character or your guess word: ");
                    guessChar = in.nextLine();
                    countTrial++;
                }
            }

            //Kiểm tra các kí tự nhập đúng
            for (int i = 0; i < guessedString.length(); i++) {
                if (guessChar.equals(Character.toString(guessedString.charAt(i)))) {
                    checkEachCharacter[i] = true;
                }
            }

            if (!check) {
                System.out.print("Trial " + countTrial + ": ");
                for (int i = 0; i < guessedString.length(); i++) {
                    if (checkEachCharacter[i]) {
                        System.out.print(guessedString.charAt(i));
                    } else {
                        System.out.print("-");
                    }
                }
            }
            System.out.println();

            // Kiểm tra xem tất cả các ký tự đã được đoán chưa
            boolean checkArray = true;
            for (int i = 0; i < guessedString.length(); i++) {
                if (!checkEachCharacter[i]) {
                    checkArray = false;
                    break;
                }
            }

            if (checkArray) {
                System.out.println("Congratulation!");
                System.out.println("You got it in " + countTrial + " trials");
                check = true;
            }

            countTrial++;
        }
    }
}
