package Lecture22_charhacterArray;

public class First {
    public static void main(String[] args) {
        String name = "abaAbcbaABA";
        System.out.println(isPlaindrome(name));
//        System.out.println((char) (name.charAt(0) + 32));
    }

    static boolean isPlaindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j) ||
                    str.charAt(i) == (str.charAt(j) + 32) ||
                    str.charAt(i) == (str.charAt(j) - 32)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
