package com.mtuci;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        boolean r = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) r = false;
            i++;
            j--;
        }
        return r;
    }

    public static String reverseString(String s){
        String r = "";
        if (isPalindrome(s)) r = s;
        else {
            for (int i = s.length() - 1; i >= 0; i--) {
                r = r + s.charAt(i);
            }
        }
        return r;
    }
}
