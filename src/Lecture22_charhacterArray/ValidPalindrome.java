package Lecture22_charhacterArray;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        boolean ans = validPalindrome(str);
        System.out.println(ans);
    }

    static boolean isAlphaNum(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            return true;
        if (ch >= 'a' && ch <= 'z')
            return true;
        if (ch >= '0' && ch <= '9')
            return true;

        return false;
    }

    static boolean validPalindrome(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (isAlphaNum(str.charAt(i))) {
                temp = temp + str.charAt(i);
                System.out.println(temp);
            }
        }
        System.out.println(temp);

        temp = temp.toLowerCase();
        System.out.println(temp);
        if (temp.isEmpty()) return true;
        int i = 0, j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j))
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
