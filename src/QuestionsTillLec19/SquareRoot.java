package QuestionsTillLec19;

public class SquareRoot {
    public static void main(String[] args) {
        double num = 37;
        double tempSol = squareRoot((long) num);
        double squareroot = morePrecesion(num, 2, tempSol);
        System.out.println("The sqaure root of " + num + " is " + squareroot);
    }

    static long squareRoot(long num) {
        long low = 0, high = num;
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == num) {
                return mid;
            }
            if (square > num) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }

    static double morePrecesion(double num, int precesion, double tempSol) {
        double factor = 1;
        double ans = tempSol;

        for (int i = 0; i < precesion; i++) {
            factor /= 10;
            for (double j = ans; j * j < num; j += factor) {
                ans = j;
            }
        }
        return ans;
    }
}
