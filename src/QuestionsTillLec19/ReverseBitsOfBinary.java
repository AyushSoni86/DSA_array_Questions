package QuestionsTillLec19;

public class ReverseBitsOfBinary {
    public static void main(String[] args) {
        System.out.println(reverseBits(32));
    }

    static long reverseBits(int num){
        long reverse = 0;
        for (int i = 0; i < 32; i++) {
            reverse = reverse << 1;
            long mask = 1 << i;
            if ((num & mask) != 0)
                reverse = reverse | 1;
        }


        return reverse;
    }
}
