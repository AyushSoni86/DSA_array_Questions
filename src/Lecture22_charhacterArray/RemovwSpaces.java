package Lecture22_charhacterArray;

public class RemovwSpaces {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hii i am ayush");

//        StringBuilder temp = removeSpace1(str);
        str = removeSpace1(str);
        System.out.println(str);
    }

    static String removeSpace(String str){
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                temp = temp + "@40";
            else
                temp = temp + str.charAt(i);
        }
        return temp;
    }

    static StringBuilder removeSpace1(StringBuilder str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                str.insert(i,"@40");
            }
        }
        return str;
    }
}
