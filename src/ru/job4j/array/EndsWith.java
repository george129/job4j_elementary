package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] pattern) {
        boolean res = true;
        if (word.length < pattern.length) {
            return false;
        }
        for (int i = 0; i < pattern.length; i++) {
            if (word[word.length - i - 1] != pattern[pattern.length - i - 1]) {
                return false;
            }
        }
        return res;
    }

}
