import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        int digit, lastTwo;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму в юанях: ");
        yuan = input.nextInt();

        digit = yuan % 10;
        lastTwo = yuan % 100;

        String currency;
        if (lastTwo >= 11 && lastTwo <= 14) {
            currency = "юаней";
        } else if (digit == 1) {
            currency = "юань";
        } else if (digit >= 2 && digit <= 4) {
            currency = "юаня";
        } else {
            currency = "юаней";
        }

        roubles = Math.ceil(ROUBLES_PER_YUAN * yuan);

        System.out.println(yuan + " " + currency + " = " + roubles + " руб.");

        input.close();
    }
}