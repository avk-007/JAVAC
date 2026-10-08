package LEVEL1;
// Check whether a character is a vowel or consonant
import java.util.Scanner;

public class vowel {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        char sc = scan.next().charAt(0);

        if (sc == 'a' || sc=='e'|| sc=='i'|| sc=='o'|| sc=='u'){
            System.out.println("vowel");
        }
        else {
            System.out.println("not vowel");
        }

    }
}
