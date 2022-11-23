import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random r = new Random();

        int randomNumber = r.nextInt(-1,100) +1;

        int count = 0;

        while (count != 10){

            int input = Integer.parseInt(scan.nextLine());

            if (input < randomNumber){
                System.out.println("number is lesser than the required number");
            } else if (input > randomNumber){
                System.out.println("Number is Greater than the required number");
            } else {
                break;
            }
            count++;
        }

        if (count < 10){
            System.out.println("Good job. You win!");
        } else {
            System.out.println("Sorry.. You lose.");
        }
    }
}
