package com.github;

import java.util.*;

public class NonRepeatChar {

    public char firstNotRepeatingCharacter(String s) {
        Set<Character> repeating = new HashSet<>();
        List<Character> charList = new ArrayList<>();
        try {
            for (int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                if (repeating.contains(letter)) {
                    continue;
                }
                if (charList.contains(letter)) {
                    charList.remove((Character) letter);
                    repeating.add(letter);
                } else {
                    charList.add(letter);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You should enter letters");
        }
        return charList.get(0);
    }
}
