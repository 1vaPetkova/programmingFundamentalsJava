package T01basicSyntax.moreExercises;

import java.util.Scanner;

public class P02englishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int lastDigit = num%10;
        String output = "";
        switch (lastDigit){
            case 0:
                output = "zero";
                break;
            case 1:
                output = "оne";
                break;
            case 2:
                output = "two";
                break;
            case 3:
                output = "three";
                break;
            case 4:
                output = "four";
                break;
            case 5:
                output = "five";
                break;
                case 6:
                output = "six";
                break;
                case 7:
                output = "seven";
                break;
                case 8:
                output = "eight";
                break;
                case 9:
                output = "nine";
                break;
        }
        System.out.println(output);
    }
}
