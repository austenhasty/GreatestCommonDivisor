import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(greatestCommonDivisor(a, b));
    }

 /*   public static int greatestCommonDivisor(int a, int b) {
        int common = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                if (i > common) {
                    common = i;
                }
            }
        }
        return common;
    } */

    public static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a%b);
        }

    }
}
