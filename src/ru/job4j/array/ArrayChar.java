package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pattern) {
        boolean res = true;
        if (word.length < pattern.length) {
            return false;
        }
        for (int i = 0; i < pattern.length; i++) {
            if (word[i] != pattern[i]) {
                return false;
            }
        }
        return res;
    }
}
