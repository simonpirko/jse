package com.example.codewars;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        t.test4("TTTT");
    }

    public String test1(String a) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        int good = 0;
        int bad;
        for (int i = 0; i < a.length(); i++) {
            for (char anAlphabet : alphabet) {
                if (a.charAt(i) == anAlphabet) good++;
            }
        }
        bad = a.length() - good;
        return bad + "/" + a.length();
    }

    public int test2(int[] a) {
        boolean isT = false;
        int isTw = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                isTw++;
            }
        }
        if (isTw > (a.length / 2)) isT = true;
        if (!isT) {
            for (int anA : a) {
                if (anA % 2 == 0) return anA;
            }
        } else {
            for (int anA : a) {
                if (anA % 2 != 0) return anA;
            }
        }
        return -1;
    }

    public int test3(int[] numbers) {
        int mod = numbers[0];
        if (mod != numbers[1]) return mod;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != mod) {
                return numbers[i];
            } else mod = numbers[i];
        }
        return -1;
    }

    public String test4(String dna) {
        char[] replace = dna.toCharArray();
        for (int i = 0; i < dna.length(); i++) {
            if (replace[i] == 'A'){
                replace[i] = 'T';
            } else if (replace[i] == 'T') {
                replace[i] = 'A';
            } else if (replace[i] == 'C') {
                replace[i] = 'G';
            } else if (replace[i] == 'G'){
                replace[i] = 'C';
            }
        }
        return String.valueOf(replace);
    }

    public int test5() {

        return -1;
    }
}
