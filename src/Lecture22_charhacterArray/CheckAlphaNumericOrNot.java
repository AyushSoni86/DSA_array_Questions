package Lecture22_charhacterArray;

public class CheckAlphaNumericOrNot {
    public static void main(String[] args) {
        String str = "N2 i&nJA?a& jnI2n";
        String str1 = "2 i&nJA?a& jnI2";
        String str2 = " i&nJA?a& jnI";
        String str3 = "&nJA?a& jn";
        String str4 = "JA?a& j";
        String str5 = "A?a& ";
        System.out.println(checkPalindrome(str));
        System.out.println(checkPalindrome(str1));
        System.out.println(checkPalindrome(str2));
        System.out.println(checkPalindrome(str3));
        System.out.println(checkPalindrome(str4));
        System.out.println(checkPalindrome(str5));
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

    public static boolean checkPalindrome(String str) {

        int i = 0, j = str.length() - 1;
        while (i < j) {

            while (!isAlphaNum(str.charAt(i))) {
                i++;
            }
            while(!isAlphaNum(str.charAt(j))) {
                j--;
            }

            if (str.charAt(i) == str.charAt(j) ||
                    str.charAt(i) == (str.charAt(j) + 32) ||
                    str.charAt(i) == (str.charAt(j) - 32)) {
                i++;
                j--;

            } else return false;
        }
        return true;

    }
}
