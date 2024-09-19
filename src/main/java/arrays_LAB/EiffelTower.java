package arrays_LAB;
import java.util.Scanner;

public class EiffelTower {
    static String repeatStr(String str, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(str);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        int width = 2 * N + 6;
        int height = 3 * N + 1;

        int dotsCount = (width - 1) / 2;

        // top part
        for (int row = 1; row <= N; row++) {
            System.out.println(repeatStr(".", dotsCount) + "*" + repeatStr("*", row - 1)
                    + "|" + repeatStr("*", row - 1) + "*"
                    + repeatStr(".", dotsCount));
            dotsCount--;
        }

        // middle part
        System.out.println(repeatStr("-", width));
        System.out.println("|" + repeatStr("*", width - 2) + "|");

        // bottom part
        for (int row = 1; row <= N / 2; row++) {
            System.out.println("|" + repeatStr(".", N / 2) + repeatStr("*", N / 2 + 1)
                    + "|" + repeatStr("*", N / 2 + 1) + repeatStr(".", N / 2));
        }

        System.out.println("@" + repeatStr("=", N) + "@" + repeatStr("=", N) + "@");
    }


}






