import java.util.Scanner;

public class Dragon {
    public static void main(String[] args) {
        System.out.println("You are in a land full of dragons. In front of you, \n" +
                "you see two caves....\n" +
                "In one cave,"+ "the dragon is friendly \n " +
                "and will share his treasure with you." + "The other dragon \n" +
                "is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        System.out.println("--------------------------------------");
        Scanner xx = new Scanner(System.in);
        // Sample content here committed via git
        int option = xx.nextInt();
        if (option == 1) { // If user selects cave 1
            System.out.println("You approach the cave...\n" +
                    "It is dark and spooky...\n" +
                    "A large dragon jumps out in front to you! He opens his jaws and ...\n" +
                    "Gobbles you down in one bite!");
        } else if (option == 2) { // If user selects cave 2
            System.out.println("Friendly Dragon and would like to share his treasure with you!");
        } else {
            System.out.println("You are lost!");
        }
    }
}
