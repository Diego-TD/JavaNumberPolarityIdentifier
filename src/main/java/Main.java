import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float number;
        String result;

        System.out.println("Introduce a number to analyze its polarity: ");
        number = scan.nextFloat();

        if (number > 0) {
            result = "The number is positive.";
        } else if (number < 0) {
            result = "The number is negative.";
        } else {
            result="The number is neutral.";
        }

        System.out.println(result);
    }
}
