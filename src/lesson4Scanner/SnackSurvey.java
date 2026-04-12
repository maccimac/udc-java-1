package lesson4Scanner;

import java.util.Scanner;

public class SnackSurvey {

    public static void main(String[] args) {
        boolean keepRunning = true;

        try {
            Scanner scanner = new Scanner(System.in);

            while (keepRunning) {
                System.out.println("Snacks for breakroom?");
                System.out.println("1. Fruit");
                System.out.println("2. Chips");
                System.out.println("3. Candy");
                System.out.println("Please enter your selection.");

                int selection = scanner.nextInt();

                if (selection == 1) {
                    System.out.println("You selected: Fruit");
                    keepRunning = false;
                } else if (selection == 2) {
                    System.out.println("You selected: Chips");
                    keepRunning = false;
                } else if (selection == 3) {
                    System.out.println("You selected: Candy");
                    keepRunning = false;
                } else {
                    System.out.println("Please enter a valid option (1, 2, or 3).");
                }
            }
        } catch (Exception e) {

        }
    }
}
