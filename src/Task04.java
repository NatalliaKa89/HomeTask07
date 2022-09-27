import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input number of month: ");
        int number = scanner.nextInt();
        String msg = "Error";

        if (number >= 1 && number <= 12) {
            msg = switch (number) {
                case 1 -> "January 31";
                case 3 -> "March 31";
                case 5 -> "May 31";
                case 7 -> "July 31";
                case 8 -> "August 31";
                case 10 -> "October 31";
                case 12 -> "December 31";
                case 2 -> "February 28";
                case 4 -> "April 30";
                case 6 -> "June 30";
                case 9 -> "September 30";
                case 11 -> "November 30";
                default -> "Error";
            };

        }

        System.out.println("In " + msg + " days");


    }
}



