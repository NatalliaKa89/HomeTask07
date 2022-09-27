import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        char input;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your letter: ");
        input = scan.nextLine().toLowerCase().toCharArray()[0];
        switch (input) {
            case 'a': {
            }
            case 'e': {
            }
            case 'i': {
            }
            case 'o': {
            }
            case 'u': {
            }
            case 'y': {

                System.out.println("Letter " + input + " is vowel");
            }
            break;
            default: {
                System.out.println("Letter " + input + " is consonant");
            }
        }
    }
}


