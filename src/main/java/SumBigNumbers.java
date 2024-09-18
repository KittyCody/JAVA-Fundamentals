import java.math.BigInteger;
import java.util.Scanner;

public class SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        System.out.println(firstNumber.add(secondNumber));

        scanner.close();
    }
}

//static methods belong to the class, not to the objects created through that class.
//if it's not static, i need to first create a method using that class in order to use the method.