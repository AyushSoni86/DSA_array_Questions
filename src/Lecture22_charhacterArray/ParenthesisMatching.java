package Lecture22_charhacterArray;

import java.util.Scanner;

public class ParenthesisMatching {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String str = "package Lecture22_charhacterArray;\n" +
                "\n" +
                "public class CheckAlphaNumericOrNot {\n" +
                "    public static void main(String[] args) {\n" +
                "        String str = \"N2 i&nJA?a& jnI2n\";\n" +
                "        String str1 = \"2 i&nJA?a& jnI2\";\n" +
                "        String str2 = \" i&nJA?a& jnI\";\n" +
                "        String str3 = \"&nJA?a& jn\";\n" +
                "        String str4 = \"JA?a& j\";\n" +
                "        String str5 = \"A?a& \";\n" +
                "        System.out.println(checkPalindrome(str));\n" +
                "        System.out.println(checkPalindrome(str1));\n" +
                "        System.out.println(checkPalindrome(str2));\n" +
                "        System.out.println(checkPalindrome(str3));\n" +
                "        System.out.println(checkPalindrome(str4));\n" +
                "        System.out.println(checkPalindrome(str5));\n" +
                "    }\n" +
                "\n" +
                "    static boolean isAlphaNum(char ch) {\n" +
                "        if (ch >= 'A' && ch <= 'Z')\n" +
                "            return true;\n" +
                "        if (ch >= 'a' && ch <= 'z')\n" +
                "            return true;\n" +
                "        if (ch >= '0' && ch <= '9')\n" +
                "            return true;\n" +
                "\n" +
                "        return false;\n" +
                "    }\n" +
                "\n" +
                "    public static boolean checkPalindrome(String str) {\n" +
                "\n" +
                "        int i = 0, j = str.length() - 1;\n" +
                "        while (i < j) {\n" +
                "\n" +
                "            while (!isAlphaNum(str.charAt(i))) {\n" +
                "                i++;\n" +
                "            }\n" +
                "            while(!isAlphaNum(str.charAt(j))) {\n" +
                "                j--;\n" +
                "            }\n" +
                "\n" +
                "            if (str.charAt(i) == str.charAt(j) ||\n" +
                "                    str.charAt(i) == (str.charAt(j) + 32) ||\n" +
                "                    str.charAt(i) == (str.charAt(j) - 32)) {\n" +
                "                i++;\n" +
                "                j--;\n" +
                "\n" +
                "            } else return false;\n" +
                "        }\n" +
                "        return true;\n" +
                "\n" +
                "    }\n" +
                "}\n";

        boolean ans = isBracketMatch(str);
        System.out.println(ans);
    }

    static boolean isBracketMatch(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if (val == '(' || val == '{' || val == '['
                    || val == ')' || val == '}' || val == ']'){
                temp.append(val);
            }
        }
        System.out.println(temp);
        int i = 0, j = temp.length() - 1;
        while(i < j){
            if (temp.charAt(i) != temp.charAt(j))
                return false;
            else{
                i++; j--;
            }
        }
        return true;
    }
}
