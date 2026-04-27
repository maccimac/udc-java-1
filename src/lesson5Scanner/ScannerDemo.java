package lesson4Scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("What is your favorite decimal number?");
        double favoriteNumber = scanner.nextDouble();

        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite number is " + favoriteNumber + ".");

        scanner.close();
    }
}
