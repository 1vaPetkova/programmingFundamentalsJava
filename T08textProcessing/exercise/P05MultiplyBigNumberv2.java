package T08textProcessing.exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05MultiplyBigNumberv2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scan.nextLine());
        BigInteger secondNumber = new BigInteger(scan.nextLine());

        System.out.println(firstNumber.multiply(secondNumber));
    }
}
