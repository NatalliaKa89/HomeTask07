import java.util.Scanner;
public class Task02 {

    public static final String[] BELOW_TWENTY = {"zero", "one", "two", "tree", "four", "five", "six", "seven",
            "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen"};
    public static final String[] TENS = {"ten", "twenty", "thirty", "forty", "fifty", "sixty",
            "seventy", "eighty", "ninety", "one hundred"};
    public static final String[] HUNDREDTHS = {"one hundred"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input your number from 1 till 120: ");

        int number = scanner.nextInt();
        if (number >= 1 && number < 20)
            System.out.println(BELOW_TWENTY[number]);

        if (number >= 20 && number <= 100) {
            int high = number / 10 - 1;
            int low = number % 10;
            String text = TENS[high];
            if (low != 0)
                text = text + " " + BELOW_TWENTY[low];
            System.out.println(text);

        }else if (number > 100 ) {

            int high = number / 100 - 1;
            int low = number % 100;
            String text = HUNDREDTHS[high];
            if ( low != 0 )
                text = text + " " +TENS[low] + " " +BELOW_TWENTY[low] ;
            System.out.println(text);


        }
    }
}


