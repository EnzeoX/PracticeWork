package com.github;

import java.util.InputMismatchException;

public class UserInputHandler {

    public void userInputDigits() {
            System.out.println("Enter two-digit integer to find summ of them");
            int number = 0;
            try {
                number = Integer.parseInt(ScannerInput.userInput());
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("You should only enter digits");
                userInputDigits();
            }
            if (number < 10 || number > 99) {
                System.out.println("The value should not be less than 10 and not more than 99");
                userInputDigits();
            } else {
                System.out.println(new DigitOperations().addTwoDigits(number));
        }
    }

    public void userInputString() {
        System.out.println("Enter string to find non-repeatable element in it");
        String s = "";
        try {
            s = ScannerInput.userInput();
        } catch (InputMismatchException e) {
            System.out.println("You should only enter digits");
            userInputDigits();
        }
        if (s.length() > 99) {
            System.out.println("The length of the string should not be less than 1 and not more than 100000");
            userInputDigits();
        } else {
            System.out.println(new NonRepeatChar().firstNotRepeatingCharacter(s));
        }
    }

    public void userInputLargestNum() {
        System.out.println("Enter integer to find largest number that contains exactly quantity of digits");
        int s = 0;
        try {
            s = Integer.parseInt(ScannerInput.userInput());
        } catch (InputMismatchException e) {
            System.out.println("You should only enter digits");
            userInputDigits();
        }
        if (s < 0 || s > 10) {
            System.out.println("The length of the integer should not be less than 1 and not more than 9");
            userInputDigits();
        } else {
            System.out.println(new DigitOperations().largestNumber(s));
        }
    }
}
