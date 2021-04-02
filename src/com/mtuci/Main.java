package com.mtuci;

import com.mtuci.Palindrome;

public class Main {

    public static boolean isPrime(int n){
        int i = 2;
        if (Math.abs(n) > 2){
            while((i < n) && (Math.abs(n) % i != 0)) {
                i++;
            }
        }
        else return true;
        if (i == n) return true;
        else return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) System.out.print(i + "; ");
        }
        System.out.println();
        System.out.println(com.mtuci.Palindrome.isPalindrome("ppt"));
        System.out.println(com.mtuci.Palindrome.isPalindrome("soos"));
        System.out.println(com.mtuci.Palindrome.reverseString("reverse"));
    }
}
