import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int radius = Integer.parseInt(scan.nextLine());

        int squareSide = Integer.parseInt(scan.nextLine());

        int passage = Integer.parseInt(scan.nextLine());

        int result = squareSide - (radius*2);

        if (result >=passage){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
