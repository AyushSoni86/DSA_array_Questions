package Lecture7LeetCodeProblems;

public class DS_03_powerOfTwo {
    public static void main(String[] args) {
        int num = 1281;
        System.out.println(isPowerOf2two(num));
    }

    static boolean isPowerOf2two(int num){
        int count = 0;
        while(num != 0){
            num = num & (num-1);
            count++;
        }
        return count == 1;
    }
    static boolean isPowerOfTwo(int num) {
        int count = 0;
        while (num != 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num >>= 1;
        }
        if (count == 1) return true;
        return false;
    }

    static boolean isPowerOfTwo2(int num) {
        int res = 1;
        for (int i = 0; i < 31; i++) {
            if (num == res) return true;
            res = res * 2;
        }
        return false;
    }
}
