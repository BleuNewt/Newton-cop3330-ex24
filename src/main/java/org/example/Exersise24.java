package org.example;
/*  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Newton */

import java.util.Arrays;
import java.util.Scanner;

public class Exersise24
{
    static void isAnagram(String str1, String str2) {

        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string:");
        String word1 = scan.next();
        System.out.println("Enter the second string:");
        String word2 = scan.next();
        isAnagram(word1,word2);
    }
}
