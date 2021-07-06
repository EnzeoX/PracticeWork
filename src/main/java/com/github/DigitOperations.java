package com.github;

public class DigitOperations {

    public int addTwoDigits(int n) {
        int buffer;
        int sum = 0;
        while (n > 0) {
            buffer = n % 10;
            sum = sum + buffer;
            n = (n - buffer) / 10;
        }
        return sum;
    }

    public int largestNumber(int n) {
        StringBuilder s = new StringBuilder();
        s.append("9".repeat(Math.max(0, n)));
        return Integer.parseInt(s.toString());
    }
}
