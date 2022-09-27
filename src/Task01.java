import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input your number from 6 till 14: ");
        int number = scanner.nextInt();
        String msg = "Error";

        if (number >= 6 && number <= 14) {
            msg = switch (number) {
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                case 10 -> "Ten";
                case 11 -> "Jack";
                case 12 -> "Queen";
                case 13 -> "King";
                case 14 -> "Ace";
                default -> "Error";
            };

        }

        System.out.print("Input your number from 1 till 4: ");
        int num = scanner.nextInt();

        String msg1 = "Error";
        if (num >= 0 && num <= 5) {
            msg1 = switch (num) {
                case 1 -> "Spades";
                case 2 -> "Clubs";
                case 3 -> "Diamonds";
                case 4 -> "Hearts";
                default -> "Error";
            };
        }

        System.out.println("Your card is " + msg + " " + msg1);
        scanner.close();
    }
}


