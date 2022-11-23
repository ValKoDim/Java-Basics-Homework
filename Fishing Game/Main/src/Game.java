import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "1. View capacity;\n" +
                "2. View state of Pond;\n" +
                "3. Add fish( Carp or SheatFish);\n" +
                "4. Catch fish (concrete instance);\n" +
                "5. Finish the game.");


        String input = scan.nextLine();

        Pond pond = new Pond();


        while (!input.equals("5")){

            switch (input){

                case "1":
                    pond.showCapacity();
                    break;
                case "2":
                    pond.showState();
                    break;
                case "3":
                    System.out.println("Carp ot Sheatfish?");
                    String type = scan.nextLine();
                    System.out.println("How heavy in kg?");
                    String weight = scan.nextLine();
                    if (type.equals("Carp")){
                        System.out.println("What colour?");
                        String colour = scan.nextLine();
                        Carp carp = new Carp(colour,weight);
                        pond.obtainFish(carp);

                    } else {
                        System.out.println("With how long whiskers in cm?");
                        String whiskers = scan.nextLine();
                        SheatFish sheatFish = new SheatFish(whiskers,weight);
                        pond.obtainFish(sheatFish);
                    }
                    break;
                case "4":
                    pond.lostFish();
                    break;
            }


            input = scan.nextLine();
        }
    }
}
