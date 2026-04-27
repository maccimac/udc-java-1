package lesson4Regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTester {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      boolean isValid = false;

      while(isValid == false) { 

        System.out.println("Enter an email: ");
        String email = scanner.nextLine();
        String regex = "^(.+)@(.+)\\.(.+)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);


        System.err.println("------------");
        boolean found = matcher.find();
        System.out.println("Matcher find: " + found);
        if (found) {
          
          System.out.println("--Matcher group: " + matcher.group());
          System.out.println("--Matcher start: " + matcher.start());
          System.out.println("--Matcher end: " + matcher.end());
        }
        System.err.println("------------");
        System.out.println("Matcher replaceAll: " + matcher.replaceAll("REPLACED"));
        System.out.println("Matcher replaceFirst: " + matcher.replaceFirst("FIRST"));
        matcher.reset(email);
        System.out.println("[after reset]");
        System.out.println("Matcher replaceAll: " + matcher.replaceAll("REPLACED"));
        System.out.println("Matcher replaceFirst: " + matcher.replaceFirst("FIRST"));
        System.err.println("------------");
        matcher.reset(email);
        System.out.println("Matcher lookingAt: " + matcher.lookingAt());
        matcher.reset(email);
        boolean matches = matcher.matches();
        System.out.println("Matcher matches: " + matches);
        System.err.println("------------");
        if (matches) {
            System.out.println("Valid email address.");
            isValid = true;
        } else {
            System.out.println("Invalid email address.");
        }
      }

    }
}
